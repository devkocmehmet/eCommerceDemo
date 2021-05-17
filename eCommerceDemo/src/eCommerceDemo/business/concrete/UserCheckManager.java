package eCommerceDemo.business.concrete;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import eCommerceDemo.business.abstracts.UserChechkServices;

public class UserCheckManager implements UserChechkServices{

	@Override
	public boolean passwordControl(String password) {
		if(password.length() >= 6)
			return true;	
		return false;
	}

	@Override
	public boolean nameControl(String firstName, String lastName) {
		if(firstName.length() >= 2 && lastName.length() >= 2)
			return true;
		return false;
	}

	@Override
	public boolean eMailControl(String eMail) {
		Pattern p = Pattern.compile("(@)(.+)$");
        Matcher m = p.matcher(eMail);

        if (m.find()) {
            System.out.println("Kullanılabilir Mail Adresi");
            return true;
        } else {
        	System.out.println("Mail Hatalı");
            return false;
        }
	}
	
}
