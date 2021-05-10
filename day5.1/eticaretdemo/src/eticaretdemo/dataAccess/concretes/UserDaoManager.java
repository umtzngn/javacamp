package eticaretdemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eticaretdemo.dataAccess.abstracts.UserDao;
import eticaretdemo.entities.concretes.User;

public class UserDaoManager implements UserDao { 
	
	private List<User> users;


	public UserDaoManager(User user) {
		super();
		this.users = new ArrayList<User>();
	}

	@Override
	public void add(User user) {
		users.add(user);
		System.out.println(user.getEmail() + " Kayit Oldu");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getEmail() + " Güncellendi");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getEmail() + " Kayit silindi");
		
	}

	@Override
	public List<User> getAll() {
		return users;
	}

	@Override
	public User get(int id) {
		return users.stream().filter(u -> u.getId() == id).findFirst().get();
	}

	@Override
	public List<String> getEmails() {
	       List<String>  emails = new ArrayList<String>();
	        for (User user : users) {
	            emails.add(user.getEmail());
	        }
	        return emails;
	}

	@Override
	public boolean isMailMatch(User user) {
		return getEmails().stream().anyMatch(x -> x == user.getEmail());
	}

	@Override
	public boolean isPasswordMatch(User user) {
		return users.stream().anyMatch(user_ -> user_.getPassword() == user.getPassword());
	}

}
