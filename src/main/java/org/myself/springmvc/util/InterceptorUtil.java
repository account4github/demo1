package org.myself.springmvc.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.myself.springmvc.bean.Response;

/**  
 * @ClassName: InterceptorUtil
 * @Description: 拦截器的工具
 * @author caoshuo@wulogo.com  
 * @date 2015年12月30日 上午10:58:17
 * @since V1.0 
 */
public class InterceptorUtil {

	private static Logger logger = LogManager.getLogger(InterceptorUtil.class.getName());
	/**
	 * @Title: printRespMsg
	 * @Description: 将系统响应返回到客户端
	 * @param response
	 * @param respMsg
	 */
	public static void printRespMsg(HttpServletResponse response, Response<?> respMsg){
		PrintWriter writer = null;
		try {
			response.setContentType("application/json; charset=utf-8");
			response.setHeader("Cache-Control", "no-cache");
			
			writer = response.getWriter();
			//封装为指定的返回对象
			writer.write(respMsg.toJson());
			
			writer.flush();                   
			
		} catch (IOException e) {
			logger.error("向客户端输出参数校验失败信息时出错", e);
		}finally {
			if(writer != null){
				writer.close();
			}
		}
	}

}