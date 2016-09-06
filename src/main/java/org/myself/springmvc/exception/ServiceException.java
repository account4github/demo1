package org.myself.springmvc.exception;

/**
 * @ClassName: ServiceException
 * @Description: ServiceException对象
 * @author caoshuo@wulogo.com
 * @date 2016年1月4日 下午2:22:05
 * @since V1.0
 */
public class ServiceException extends BaseException {

	private static final long serialVersionUID = 1L;

	public ServiceException() {
		super();
	}

	public ServiceException(String msg) {
		super(msg);
	}

	public ServiceException(String msg, Exception e) {
		super(msg, e);
	}
}