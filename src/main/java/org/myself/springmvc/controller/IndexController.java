package org.myself.springmvc.controller;

import org.myself.springmvc.bean.Response;
import org.myself.springmvc.param.TestParam;
/**
 * @ClassName: IndexController
 * @Description: 对外主接口及相关测试接口
 * @author caoshuo@wulogo.com  
 * @date 2015年12月23日 下午2:31:36
 * @since V1.0
 */
public interface IndexController extends BaseController {
	/**
	 * @Title: index
	 * @Description: 首页
	 * @return
	 */
	public String index();
	/**
	 * @Title: api
	 * @Description: 所有API接口的入口
	 * @return
	 */
	public String api();
	/**
	 * @Title: callback
	 * @Description: 所有callback接口的入口
	 * @return
	 */
	public String callback();
	/**
	 * @Title: test
	 * @Description: 连接测试
	 * @param param
	 * @return
	 */
	public Response<String> test(TestParam param);
	
}