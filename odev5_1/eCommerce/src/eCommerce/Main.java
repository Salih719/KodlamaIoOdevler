package eCommerce;

import eCommerce.business.abstracts.UserService;
import eCommerce.business.abstracts.ValidationService;
import eCommerce.business.concretes.UserManager;
import eCommerce.business.concretes.ValidationManager;
import eCommerce.core.emailLogger.LoggerManager;
import eCommerce.dataAccess.concretes.HibernateUserDao;
import eCommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserService userService = new UserManager(new HibernateUserDao(),new ValidationManager(),new LoggerManager());
		
		User user = new User(1,"Salih","Kurt","salih@salih.com","123456","123456");
		User user2 = new User(2,"Mehmet","Kurt","mehmet@mehmet.com","123","123");
		
		
		userService.signUp(user);
		userService.signIn(user);
		
	}

}
