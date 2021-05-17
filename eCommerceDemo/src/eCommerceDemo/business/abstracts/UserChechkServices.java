package eCommerceDemo.business.abstracts;

public interface UserChechkServices {
	boolean passwordControl(String password);
	boolean nameControl(String firstName, String lastName);
	boolean eMailControl(String eMail);
}
