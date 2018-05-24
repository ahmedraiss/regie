package ma.gov.ancfcc.regie.applicatif.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import ma.gov.ancfcc.regie.applicatif.service.LoginAService;
import ma.gov.ancfcc.regie.business.service.LoginBService;
import ma.gov.ancfcc.regie.dao.entity.LoginEntity;

public class LoginAServiceImpl implements LoginAService {

	@Autowired
	private LoginBService loginBService;

	@Transactional
	public void add(LoginEntity login) {
		loginBService.add(login);

	}

}
