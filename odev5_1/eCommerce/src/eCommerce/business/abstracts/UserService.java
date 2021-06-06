package eCommerce.business.abstracts;

import java.util.List;

import eCommerce.entities.concretes.User;

public interface UserService {
	
	void signUp(User user);
	void signIn(User user);
	List<User> getAll();

}
