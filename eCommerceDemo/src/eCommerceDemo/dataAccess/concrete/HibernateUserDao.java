package eCommerceDemo.dataAccess.concrete;

import java.util.ArrayList;
import java.util.List;

import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.User;

public class HibernateUserDao implements UserDao{
	
	private List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		System.out.println("Kulllanıcı Eklendi "+user.getFirstName());
		users.add(user);
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		System.out.println("Kulllanıcı Silindi "+user.getFirstName());
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		System.out.println("Kulllanıcı Güncellendi "+user.getFirstName());
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return users;
	}

}
