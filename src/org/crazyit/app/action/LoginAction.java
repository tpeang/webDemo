package org.crazyit.app.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String execute() throws Exception {

		if (getUsername().equals("crazyit.org")
				&& getPassword().equals("leegan")) {
			ActionContext context = ActionContext.getContext();
			context.getSession().put("user", getUsername());
			Integer count = (Integer)context.getApplication().get("count");
			if(count!=null){
				count++;
			}else{
				count=1;
			}
	
			context.getApplication().put("count", count);

			return SUCCESS;
		} else {
			return ERROR;
		}
	}

}
