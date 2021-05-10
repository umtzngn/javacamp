package eticaretdemo;

import eticaretdemo.business.concretes.GoogleManager;
import eticaretdemo.business.concretes.UserManager;
import eticaretdemo.dataAccess.concretes.UserDaoManager;
import eticaretdemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user = new User(1, "UMUT", "ZENGÝN", "umutzengn@gmail.com", "12345", false, null);
		
		UserManager manager = new UserManager(new UserDaoManager(user));
		
		GoogleManager auth = new GoogleManager(manager);
		auth.signUp(user);
		auth.verify(user, user.getVerifyCode());
        auth.signWithGoogleService(user);
		

	}

}
