package org.myself.springmvc.controller.deft;

import org.myself.springmvc.bean.ErrorType;
import org.myself.springmvc.bean.Response;
import org.myself.springmvc.controller.IndexController;
import org.myself.springmvc.exception.ControllerException;
import org.myself.springmvc.exception.ServiceException;
import org.myself.springmvc.param.TestParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**  
 * @ClassName: DeftIndexController
 * @Description: 
 * @author caoshuo@wulogo.com  
 * @date 2015年12月23日 下午4:39:40
 * @since V1.0 
 */
@Controller
public class DeftIndexController extends DeftBaseController implements IndexController {

	@RequestMapping("/")
	public String index(){
		//这里可以加中文注释
		return null;
	}
	
	@RequestMapping("/api")
	public String api(){
		//所有后台接口的入口
		return null;
	}
	
	@RequestMapping("/callback")
	public String callback(){
		//所有后台接口的入口
		return null;
	}

	@RequestMapping(value="/test", method=RequestMethod.POST, produces=PRODUCES_JSON)
	@ResponseBody
	public Response<String> test(TestParam param) {
		Response<String> resp = new Response<String>();
		
		try {
			resp.setRespBody("你发送的消息是："+param.getMsg());
			resp.setErrorType(ErrorType.SUCCESS);
		} catch (ServiceException se) {
			//不需要处理，直接抛出
			throw se;
		} catch (Exception e) {
			throw new ControllerException("测试接口出现异常", e);
		}
		
		return resp;
	}
	
}