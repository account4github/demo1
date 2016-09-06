package org.myself.springmvc.bean;
/**
 * @ClassName: ErrorType
 * @Description: 系统可能发生的异常信息
 * @author caoshuo@jufenqi.com
 * @date 2014-6-5 上午11:14:49
 * @since V1.0
 */
public enum ErrorType {
	
	SUCCESS("00000", "操作成功"), 
	
	URL_INVALID("10001", "请求地址无效"),
	AUTH_FAIL("10002", "鉴权失败"),
	PARAM_INVALID("10003", "参数无效"),
	ACT_CODE_INVALID("10004", "激活码无效"),
	NO_PERMISSION("10005", "无此权限"),
	SESSION_TIMEOUT("10009", "登录超时"),
	
	DATA_EXIST("10011", "数据已存在"),
	DATA_INEXIST("10012", "数据不存在"),
	
	SMS_SEND_FAIL("10021", "短信发送失败"),
	
	
	DB_OPER("90001", "数据库操作异常"),
	DB_CONN("90002", "数据库连接异常"),
	
	UNKNOW("99999", "未知异常");
	
	
	
	private String code;
	private String desc;
	
	private ErrorType(String code, String msg) {
		this.code = code;
		this.desc = msg;
	}

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	@Override
	public String toString(){
		return "code=" + code + ", desc=" + desc;
	}
	
}