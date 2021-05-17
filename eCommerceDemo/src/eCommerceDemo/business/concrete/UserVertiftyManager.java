package eCommerceDemo.business.concrete;

import eCommerceDemo.business.abstracts.UserVertiftyServices;

public class UserVertiftyManager implements UserVertiftyServices{

	@Override
	public void sendVertiftyMessage(String eMail) {
		System.out.println(eMail + " eMailinize doðrulama kodunuz gönderildi.");
	}

	@Override
	public boolean isClickLink(String eMail, String vertiftyCode) {
		String code = "qwe123";
		if(vertiftyCode == code) {
			System.out.println(eMail + " mailiniz onaylandý.");
			return true;
		}
		else {
			System.out.println("Yanlýþ kod girildi.");
			return false;
		}
	}

}
