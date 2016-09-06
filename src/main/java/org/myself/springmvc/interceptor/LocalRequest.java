package org.myself.springmvc.interceptor;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
/**
 * @ClassName: LocalRequest
 * @Description: 将解密后的参数封装成新的请求转发给controller
 * @author caoshuo@wulogo.com  
 * @date 2015年12月23日 下午2:16:22
 * @since V1.0
 */
public class LocalRequest extends HttpServletRequestWrapper {
	
	private Map<String, String[]> params;

	public LocalRequest(HttpServletRequest request) {
		super(request);
	}
	public LocalRequest(HttpServletRequest request, Map<String, String[]> params) {
		super(request);
		this.params = params;
	}

	@Override
	public String getParameter(String name) {
		String value = null;
		if(params != null){
			String[] values = params.get(name);
			if(values != null && values.length >= 1){
				value = values[0];
			}
		}
		return value;
	}

	@Override
	public Map<String, String[]> getParameterMap() {
		return params;
	}

	@Override
	public String[] getParameterValues(String name) {
		String[] values = null;
		if(params != null){
			values = params.get(name);
		}
		return values;
	}

}