package org.myself.springmvc.controller.v0p9;

import org.myself.springmvc.bean.Response;
import org.myself.springmvc.controller.IndexController;
import org.myself.springmvc.controller.deft.DeftIndexController;
import org.myself.springmvc.param.TestParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**  
 * @ClassName: IndexControllerV0p9
 * @Description: 
 * @author caoshuo@wulogo.com  
 * @date 2015年12月23日 下午5:49:51
 * @since V1.0 
 */
@Controller
@RequestMapping("/v0p9")
public class IndexControllerV0p9 extends DeftIndexController implements IndexController {

	@Override
	@RequestMapping("/")
	public String index() {
		return super.index();
	}

	@Override
	@RequestMapping("/api")
	public String api() {
		return super.api();
	}

	@Override
	@RequestMapping(value="/test", method=RequestMethod.POST, produces=PRODUCES_JSON)
	@ResponseBody
	public Response<String> test(TestParam param) {
		return super.test(param);
	}

}