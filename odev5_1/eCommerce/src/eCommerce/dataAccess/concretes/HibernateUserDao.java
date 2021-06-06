package eCommerce.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	
	public List<User> users;
	
	public HibernateUserDao() {
		users = new ArrayList<User>();
	}

	@Override
	public void add(User user) {
		System.out.println("Hibernate ile eklendi : " + user.getFirstName());
	}

	@Override
	public void update(User user) {
		System.out.println("Hibernate ile güncellendi : " + user.getFirstName());
	}

	@Override
	public void delete(User user) {
		System.out.println("Hibernate ile Silindi : " + user.getFirstName());
	}

	@Override
	public User get(int id) {
		System.out.println("");
		return null;
	}

	@Override
	public List<User> getAll() {
		System.out.println("");
		return users;
	}

}
