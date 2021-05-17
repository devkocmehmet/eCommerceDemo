package eCommerceDemo.business.concrete;

import eCommerceDemo.business.abstracts.UserUnusedEmailServices;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.User;

public class UserUnsendEmailManager implements UserUnusedEmailServices{

	UserDao userDao;
	
	
	public UserUnsendEmailManager(UserDao userDao) {
		this.userDao = userDao;
	}


	@Override
	public boolean isEmailUnused(String eMail) {
		for (User user : userDao.getAll()) {
			if(eMail.equals(user.geteMail())) {
				System.out.println("Email kullanýlýyor.");
				return false;
			}
		}
		return true;
	}

}
