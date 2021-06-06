package eCommerce.core.emailLogger;

import eCommerce.entities.concretes.User;

public interface LoggerService {
	void sendMail(User user);
}
