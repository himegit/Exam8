package com.hand.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.hand.action.model.User;
import com.hand.dao.DaoImp;
import com.hand.model.Customer;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private User user;

	private String errMsg = "";

	private List<Object[]> ob;
	
	private List<Customer> customers;

	@Override
	public String execute() throws Exception {
		HttpServletRequest httpServletRequest = ServletActionContext.getRequest();
		HttpSession httpSession = httpServletRequest.getSession();
		if (user.getName().trim().equals("") || user.getPassword().trim().equals("")) {
			errMsg = "账号密码不能为空";
			return LOGIN;
		} else {
			DaoImp daoImp = new DaoImp();
			String result = daoImp.selectUser(user.getName(), user.getPassword());
//			for(Object[] role : ob){   
//		        System.out.println(role[0]+"--"+role[1]+"--"+role[2]);   
//		    }      
			httpSession.setAttribute("admin", "success");
			return result;
		}
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public List<Object[]> getOb() {
		return ob;
	}

	public void setOb(List<Object[]> ob) {
		this.ob = ob;
	}

	
}
