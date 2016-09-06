package org.myself.springmvc.bean;

/**
 * @ClassName: Response
 * @Description: 与客户端交互的统一对象
 * @author caoshuo@jufenqi.com
 * @date 2014-6-5 上午11:30:18
 * @param <E>
 *  @since V1.0
 */
public class Response<E>{
	
	private String errorCode;
	private String errorDesc;
	private BaseParam reqBody;
	//正常情况下应该返回给客户端的数据
	private E respBody;
	
	public Response() {
		super();
		this.setErrorType(ErrorType.SUCCESS);
	}
	public Response(ErrorType error) {
		super();
		this.errorCode = error.getCode();
		this.errorDesc = error.getDesc();
	}
	public Response(ErrorType error, E respBody) {
		super();
		this.errorCode = error.getCode();
		this.errorDesc = error.getDesc();
		this.respBody = respBody;
	}
	public Response(ErrorType error, String errorDesc) {
		super();
		this.errorCode = error.getCode();
		this.errorDesc = errorDesc;
	}

	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorDesc() {
		return errorDesc;
	}
	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}	
	public BaseParam getReqBody() {
		return reqBody;
	}
	public void setReqBody(BaseParam reqBody) {
		this.reqBody = reqBody;
	}
	public E getRespBody() {
		return respBody;
	}
	public void setRespBody(E respBody) {
		this.respBody = respBody;
	}
	public void setErrorType(ErrorType error){
		this.errorCode = error.getCode();
		this.errorDesc = error.getDesc();
	}
	
	@Override
	public String toString() {
		return "Response [errorCode=" + errorCode + ", errorDesc=" + errorDesc
				+ ", reqBody=" + reqBody + ", respBody=" + respBody + "]";
	}
	
	public String toJson(){
		return "{\"errorCode\":\""+errorCode+"\", \"errorDesc\":\""+errorDesc+"\",\"respBody\":null}";
	}
	
}