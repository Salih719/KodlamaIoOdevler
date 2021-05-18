package odev3_2;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli kullanýcý eklendi");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + "isimli kullanýcý güncellendi");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + "isimli kullanýcý silindi");
	}
	
	
}
