package org.myself.springmvc.param;
/**  
 * @ClassName: TestParam
 * @Description: 测试参数
 * @author caoshuo@wulogo.com  
 * @date 2016年1月8日 下午5:33:20
 * @since V1.0 
 */
public class TestParam {

	private String msg;

	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	@Override
	public String toString() {
		return "TestParam [msg=" + msg + ", " + super.toString() + "]";
	}

}