package eCommerce.business.concretes;

import java.util.List;

import eCommerce.business.abstracts.UserService;
import eCommerce.business.abstracts.ValidationService;
import eCommerce.core.emailLogger.LoggerService;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class UserManager implements UserService {

	
	private UserDao userDao;
	private ValidationService validationService;
	private LoggerService loggerService;
	
	
	

	public UserManager(UserDao userDao, ValidationService validationService, LoggerService loggerService) {
		super();
		this.userDao = userDao;
		this.validationService = validationService;
		this.loggerService= loggerService;
	}


	@Override
	public void signUp(User user) {
		if (!validationService.checkIfRealPerson(user)) {
			System.out.println("Kullan�c� eklenemedi");
			return;
		}
		for (User u : userDao.getAll()) {
			if (u.geteMail().equals(user.geteMail())) {
				System.out.println("Kullan�c� zaten kay�tl�");
				return;
			}
		}
		userDao.add(user);
		System.out.println("Kullan�c� ba�ar�yla kay�t oldu.");
	}
	
	
	@Override
	public void signIn(User user) {
		if (user.geteMail() != null) {
			if (validationService.checkIfRealPerson(user)) {
				System.out.println("Giri� ba�ar�l�.\nHo�geldiniz: " + user.getFirstName() + " " + user.getLastName());
			}else {
				System.out.println("Giri� ba�ar�s�z.");
			}
		}
		userDao.add(user);
	}
	

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}

	

}
