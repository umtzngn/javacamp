package eticaretdemo.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eticaretdemo.business.abstracts.UserSevice;
import eticaretdemo.dataAccess.abstracts.UserDao;
import eticaretdemo.entities.concretes.User;

public class UserManager implements UserSevice {
	
	private UserDao userDao;
	

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
        if(isValid(user) && !ifEmailExists(user)) {
            userDao.add(user);
            return;
        }
		
	}

	private boolean isValid(User user) {
		String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(user.getEmail());

        if(user.getName() == null || user.getLastname() == null
                || user.getEmail() == null || user.getPassword() == null ) {
            System.out.println("Boş bırakılmaz.");
            return false;
        }
        else {
            if(!matcher.matches()) {
                System.out.println("E-mail HatalÄ±");
                return false;
            }

            else {
                if(user.getName().length() < 2 && user.getLastname().length() < 2) {
                    if(user.getPassword().length() < 6 ) {
                        System.out.println("Å�ifreniz en az 6 haneli olmalÄ±dÄ±r.");
                        return false;
                    }
                }

            }
        }
        return true;
	}

	@Override
	public void update(User user) {
        if(isValid(user) && !ifEmailExists(user)) {
            userDao.update(user);
            return;
        }
		
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		
	}

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}

	@Override
	public User get(int id) {
		return userDao.get(id);
	}

	@Override
	public boolean ifEmailExists(User user) {
		return userDao.isMailMatch(user);
	}

	@Override
	public boolean ifPasswordExists(User user) {
		return userDao.isPasswordMatch(user);
	}

}
