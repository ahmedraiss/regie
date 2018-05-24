package ma.gov.ancfcc.regie.dao.Impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ma.gov.ancfcc.regie.dao.LoginDAO;
import ma.gov.ancfcc.regie.dao.entity.LoginEntity;

public class LoginDAOImpl implements LoginDAO {

	@PersistenceContext
	private EntityManager em;

	public void add(LoginEntity login) {
		em.persist(login);
	}
	
}
