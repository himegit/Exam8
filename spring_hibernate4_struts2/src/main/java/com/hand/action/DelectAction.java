package com.hand.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.hand.dao.DaoImp;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class DelectAction extends ActionSupport {
	
	private Object id;

	@Override
	public String execute() throws Exception {
		HttpServletRequest httpServletRequest = ServletActionContext.getRequest();
		String customer_id = httpServletRequest.getParameter("customer_id");;
		int customerId = Integer.parseInt(customer_id);
		System.out.println(customer_id);
		DaoImp daoImp = new DaoImp();
		daoImp.dele((short)customerId);
		return SUCCESS;
	}

	public Object getId() {
		return id;
	}

	public void setId(Object id) {
		this.id = id;
	}
	
	
	
}
