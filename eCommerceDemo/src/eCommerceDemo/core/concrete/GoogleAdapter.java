package eCommerceDemo.core.concrete;

import eCommerceDemo.core.abstracts.GoogeServices;

public class GoogleAdapter implements GoogeServices{

	@Override
	public void loginGoogle() {
		System.out.println("Google ile giriþ yapýldý.");
	}

}
