package eCommerceDemo.business.abstracts;

import eCommerceDemo.entities.User;

public interface UserServices {
	void register(User user);
	void login(String eMail, String password);
}
