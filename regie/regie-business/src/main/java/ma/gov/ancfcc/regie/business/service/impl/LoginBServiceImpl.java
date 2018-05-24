package ma.gov.ancfcc.regie.business.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import ma.gov.ancfcc.regie.business.service.LoginBService;
import ma.gov.ancfcc.regie.dao.LoginDAO;
import ma.gov.ancfcc.regie.dao.entity.LoginEntity;

public class LoginBServiceImpl implements LoginBService {

	@Autowired
	private LoginDAO loginDAO;
	
	@Transactional
	public void add(LoginEntity login) {
		loginDAO.add(login);
		
	}

	
	
}