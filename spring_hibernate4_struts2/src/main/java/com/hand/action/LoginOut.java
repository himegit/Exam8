package com.hand.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class LoginOut extends ActionSupport {
	
	private HttpServletRequest httpServletRequest = ServletActionContext.getRequest();
	
	private HttpSession httpSession ;

	@Override
	public String execute() throws Exception {
		httpSession = httpServletRequest.getSession();
		httpSession.setAttribute("admin", null);;
		return "loginOut";
	}
	
}
