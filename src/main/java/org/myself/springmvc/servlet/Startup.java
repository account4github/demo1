package org.myself.springmvc.servlet;

import java.util.Timer;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * @ClassName: Startup
 * @Description: 跟随系统启动的servlet
 * @author caoshuo@wulogo.com  
 * @date 2015年12月23日 下午2:18:26
 * @since V1.0
 */
public class Startup extends BaseServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger = LogManager.getLogger(Startup.class.getName());
	private Timer timer= null;//定时任务管理器
	
	public void init(ServletConfig config) throws ServletException {
		
		super.init(config);
		
		if(appContext != null){
			//初始化一些系统需要经常使用的变量
			
			
		} else {
			logger.error("系统启动后，加载SPRING组件失败！");
		}
		
		//初始化校验码超时检验的定时任务
		this.startTimeTask();
		
	}
	
	
	
	/**
	 * 
	 * @Title: startTimeTask
	 * @Description: 启动定时任务
	 * @param  参数说明
	 * @return void 返回类型
	 * @throws
	 */
	private void startTimeTask(){
		
		try {
			/*timer = new Timer();
			TimerTask task1 = new CheckActCode();
			long delay = 1000 * 60;//60秒之后启动
			long period = 1000 * 60 * 10;//每次启动间隔10分钟
			timer.schedule(task1, delay, period);*/
			logger.debug("定时任务启动成功！");
		} catch (Exception e) {
			logger.error("定时任务启动时异常！", e);
		}
	}
	
}