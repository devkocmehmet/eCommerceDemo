package eCommerceDemo.business.abstracts;

public interface UserVertiftyServices {
	void sendVertiftyMessage(String eMail);
	boolean isClickLink(String eMail, String vertiftyCode);
}
