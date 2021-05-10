package eticaretdemo.business.abstracts;

import eticaretdemo.entities.concretes.User;

public interface GoogleAuthService {
	
    void signIn(User user);
    void signWithGoogleService(User user);
    void signUp(User user);
    void verify(User user, String code);

}
