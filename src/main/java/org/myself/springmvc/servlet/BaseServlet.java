package org.myself.springmvc.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.ContextLoader;
/**
 * 
 * @ClassName: BaseServlet
 * @Description: 所有Servlet的父类
 * @author scao@brandwisdom.cn
 * @date 2014-7-30 下午8:32:51
 *
 */
public class BaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected ApplicationContext  appContext = null;
	private static Logger logger = LogManager.getLogger(BaseServlet.class.getName());
	
	public void init(ServletConfig config) throws ServletException {
		
		appContext = ContextLoader.getCurrentWebApplicationContext();
		logger.info("加载ApplicationContext成功！");
	}
	
}