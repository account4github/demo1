package org.myself.springmvc.exception;

import java.io.PrintWriter;
import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.myself.springmvc.bean.ErrorType;
import org.myself.springmvc.bean.Response;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

/**
 * @ClassName: ExceptionResolver
 * @Description: 异常处理
 * @author caoshuo@wulogo.com
 * @date 2015年12月23日 下午2:57:02
 * @since V1.0 说明：出现异常就发送错误提示
 */
public class ExceptionResolver extends SimpleMappingExceptionResolver {

	private static Logger logger = LogManager.getLogger(ExceptionResolver.class.getName());

	@Override
	protected ModelAndView doResolveException(HttpServletRequest request, HttpServletResponse response, 
			Object handler, Exception ex) {
		
		//只响应JSON格式返回，如果有需要返回error页面的请增加判断
		try {
			//记录异常信息到日志
			logger.error("", ex);
			
			//判断返回的ModelAndView是否包含ResponseBody注解
			if(handler instanceof HandlerMethod){
				HandlerMethod hm = (HandlerMethod)handler;
				Method method = hm.getMethod();
				ResponseBody respBodyAnn = AnnotationUtils.findAnnotation(method, ResponseBody.class);
				//说明需要返回json格式数据
				if (respBodyAnn != null) { 
					//响应JSON格式信息
					response.setContentType("application/json; charset=utf-8");
					response.setHeader("Cache-Control", "no-cache");
					PrintWriter writer = response.getWriter();

					// 封装为指定的返回对象
					Response<Exception> resp = new Response<Exception>(ErrorType.UNKNOW);
					resp.setErrorDesc(ex.getMessage());
					resp.setRespBody(ex);
					writer.write(resp.toJson());

					writer.flush();
				}
				//说明是页面响应，返回错误提示页面
				else{
					String viewName = determineViewName(ex, request);
					return getModelAndView(viewName, ex, request);
				}
			}else{
				logger.error("未知的异常发生！目前没有做任何处理。");
			}

		} catch (Exception e) {
			logger.error("向客户端输出异常信息时出错", e);
		}
		
		return null;
	}
	
}