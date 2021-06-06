package eCommerce.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerce.business.abstracts.ValidationService;
import eCommerce.entities.concretes.User;

public class ValidationManager implements ValidationService {

	@Override
	public boolean checkIfRealPerson(User user) {
		
		if (user.getFirstName().length() <1) {
			System.out.println("Adınız en az 2 karakterden oluşmalıdır ");
			return false;
		}
		if (user.getLastName().length() <1) {
			System.out.println("Soyadınız en az 2 karakterden oluşmalıdır");
			return false;
		}
		if (user.getPasswordHash().length() <5) {
			System.out.println("Parolanız en az 6 karakterden oluşmalıdır");
			return false;
		}
		final Pattern regexPattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",Pattern.CASE_INSENSITIVE);
		Matcher matcher = regexPattern.matcher(user.geteMail());
		if (!matcher.find()) {
			System.out.println("Incorrect Email");
			return false;
		}
		
		
		return true;
	}

}
