package eCommerceDemo.business.concrete;

import eCommerceDemo.business.abstracts.UserChechkServices;
import eCommerceDemo.business.abstracts.UserServices;
import eCommerceDemo.business.abstracts.UserUnusedEmailServices;
import eCommerceDemo.business.abstracts.UserVertiftyServices;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.User;

public class UserManager implements UserServices{
	
	UserChechkServices userCheckServices;
	UserUnusedEmailServices userUnusedEmailServices;
	UserVertiftyServices userVertiftyServices;
	UserDao userDao;
	

	public UserManager(UserChechkServices userCheckServices, UserUnusedEmailServices userUnusedEmailServices,
			UserVertiftyServices userVertiftyServices, UserDao userDao) {
		this.userCheckServices = userCheckServices;
		this.userUnusedEmailServices = userUnusedEmailServices;
		this.userVertiftyServices = userVertiftyServices;
		this.userDao = userDao;
	}

	@Override
	public void register(User user) {
		if(userCheckServices.nameControl(user.getFirstName(), user.getLastName()) && userCheckServices.passwordControl(user.getPassword())
				&& userCheckServices.eMailControl(user.geteMail()) && userUnusedEmailServices.isEmailUnused(user.geteMail())) {
			userDao.add(user);
			userVertiftyServices.sendVertiftyMessage(user.geteMail());
		}
	}

	@Override
	public void login(String eMail, String password) {
		// TODO Auto-generated method stub
		for (User user : userDao.getAll()) {
			System.out.println(user.getFirstName());
			if(eMail.equals(user.geteMail()) && password.equals(user.getPassword())) {
				System.out.println(user.getFirstName() +" kullanýcýsý giriþ yaptý.");
			}
			else {
				System.out.println("Kullanýcý bulunamadý.");
			}
		}
	}

}
