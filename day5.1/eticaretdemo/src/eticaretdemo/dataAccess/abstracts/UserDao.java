package eticaretdemo.dataAccess.abstracts;

import java.util.List;

import eticaretdemo.entities.concretes.User;


public interface UserDao {
	
    void add(User user);
    void update(User user);
    void delete(User user);
    List<User> getAll();
    User get(int id);
    List<String> getEmails();
    boolean isMailMatch(User user);
    boolean isPasswordMatch(User user);

}
