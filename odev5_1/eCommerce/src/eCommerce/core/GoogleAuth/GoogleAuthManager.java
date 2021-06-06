package eCommerce.core.GoogleAuth;

import eCommerce.entities.concretes.User;

public class GoogleAuthManager implements GoogleAuthService {

	@Override
	public void register(User user) {
		System.out.println("Google ile kayýt olundu. "+ user.getFirstName());
	}

	@Override
	public void login(User user) {
		System.out.println("Google ile giriþ yapýldý. "+ user.getFirstName());
	}

}
