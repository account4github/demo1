/**
 *本程序由曹硕开发编写
 */
package org.myself.springmvc.exception;

/**
 * <B>文件名称：</B>BaseException.java<BR>
 * <B>文件描述：</B><BR>
 * 
 * <B>版权声明：</B>(C)2014-2015<BR>
 * <B>公司部门：</B>北京众荟科技<BR>
 * <B>创建时间：</B>2016年9月6日<BR>
 * 
 * @author 曹硕
 * @version 
 */

public class BaseException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BaseException() {
		super();
	}

	public BaseException(String msg) {
		super(msg);
	}

	public BaseException(String msg, Exception e) {
		super(msg, e);
	}
	
}