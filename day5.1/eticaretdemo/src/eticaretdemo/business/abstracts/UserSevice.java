package eticaretdemo.business.abstracts;

import java.util.List;

import eticaretdemo.entities.concretes.User;


public interface UserSevice {
	
    void add(User user);
    void update(User user);
    void delete(User user);
    List<User> getAll();
    User get(int id);
    boolean ifEmailExists(User user);
    boolean ifPasswordExists(User user);

}
