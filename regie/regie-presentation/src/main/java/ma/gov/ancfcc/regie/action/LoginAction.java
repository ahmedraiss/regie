package ma.gov.ancfcc.regie.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionSupport;

import ma.gov.ancfcc.regie.applicatif.service.LoginAService;
import ma.gov.ancfcc.regie.bean.LoginBean;
import ma.gov.ancfcc.regie.dao.entity.LoginEntity;

public class LoginAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	@Autowired
	private LoginAService loginAService;
	private LoginEntity loginEntity;
	private LoginBean loginBean;

	public String login() throws Exception {
		
		loginEntity.setPassword(loginBean.getPassword());
		loginEntity.setUsername(loginBean.getUsername());

		loginAService.add(loginEntity);

		return SUCCESS;
	}

	public LoginBean getLoginBean() {
		return loginBean;
	}

	public void setLoginBean(LoginBean loginBean) {
		this.loginBean = loginBean;
	}

}
