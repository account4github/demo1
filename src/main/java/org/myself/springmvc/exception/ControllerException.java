package org.myself.springmvc.exception;

/**
 * @ClassName: ControllerException
 * @Description: ControllerException对象
 * @author caoshuo@wulogo.com
 * @date 2016年1月4日 下午2:22:05
 * @since V1.0
 */
public class ControllerException extends BaseException {

	private static final long serialVersionUID = 1L;

	public ControllerException() {
		super();
	}

	public ControllerException(String msg) {
		super(msg);
	}

	public ControllerException(String msg, Exception e) {
		super(msg, e);
	}

}