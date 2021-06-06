package eCommerce.core.GoogleAuth;

import eCommerce.entities.concretes.User;

public interface GoogleAuthService {

	void register(User user);
	void login(User user);
	
}
