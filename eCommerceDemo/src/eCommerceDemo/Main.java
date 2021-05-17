package eCommerceDemo;
import eCommerceDemo.business.abstracts.*;
import eCommerceDemo.business.concrete.*;
import eCommerceDemo.core.abstracts.GoogeServices;
import eCommerceDemo.core.concrete.GoogleAdapter;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.dataAccess.concrete.HibernateUserDao;
import eCommerceDemo.entities.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1,"Mehmet","Koç","example1@hotmail.com","123456");
		
		GoogeServices googleServices = new GoogleAdapter();
		
		UserDao userDao = new HibernateUserDao();
		
		UserServices userServices = new UserManager(new UserCheckManager(), new UserUnsendEmailManager(userDao), new UserVertiftyManager(), userDao);
		
		userServices.register(user1);
		userServices.login("example1@hotmail.com", "123456");
		googleServices.loginGoogle();
		
	}
}
