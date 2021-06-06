package eCommerce.core.emailLogger;

import eCommerce.entities.concretes.User;

public class LoggerManager implements LoggerService {

	@Override
	public void sendMail(User user) {
		System.out.println("Email gönderildi");
	}

}
