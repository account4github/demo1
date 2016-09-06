package org.myself.springmvc.bean;

/**
 * @ClassName: BaseParam
 * @Description: 所有参数类的父类
 * @author caoshuo@jufenqi.com
 * @date 2014-9-12 下午4:14:33
 * @since V1.0
 */
public class BaseParam {
	//分页需要
	protected Integer pageNo = 1;
	protected Integer pageSize = 10;
	protected String orderBy = null;
	
	public Integer getPageNo() {
		return pageNo;
	}
	public void setPageNo(Integer pageNo) {
		if(pageNo != null && pageNo > 0){
			this.pageNo = pageNo;
		}
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		if(pageSize != null && pageSize > 0){
			this.pageSize = pageSize;
		}
	}	
	public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	
	@Override
	public String toString() {
		return "pageNo=" + pageNo + ", pageSize=" + pageSize 
				+ ", orderBy=" + orderBy;
	}
	
}