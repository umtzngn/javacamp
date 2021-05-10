package eticaretdemo.business.concretes;

import eticaretdemo.business.abstracts.GoogleAuthService;
import eticaretdemo.business.abstracts.UserSevice;
import eticaretdemo.core.GoogleServiceAdapter;
import eticaretdemo.entities.concretes.User;


public class GoogleManager implements GoogleAuthService {

	private UserSevice userService;
	
	
	public GoogleManager(UserSevice userService) {
		super();
		this.userService = userService;
	}

	@Override
	public void signIn(User user) {
		if(checkUserForLogin(user)) {
            if(	userService.ifEmailExists(user) && userService.ifPasswordExists(user)) {
                System.out.println("Giriþ yapýldý.");
            }
            else {
                System.out.println("Email veya þifre yanlýþ");
            }

            return;
        }
        System.out.println("Doðrulanmamýþ hesap");
		
	}

	@Override
	public void signWithGoogleService(User user) {
		user.setVerified(true);
        if(checkUserForLogin(user)) {
            GoogleServiceAdapter googleApi = new GoogleServiceAdapter();
            googleApi.signIn(user.getEmail(), user.getPassword());
            userService.add(user);



            return;
        }
        System.out.println("Doðrulanmamýþ hesap");
		
	}

	private boolean checkUserForLogin(User user) {
		if(user.isVerified() && !(user.getEmail().isBlank() && user.getEmail() == null) &&
                !(user.getPassword().isBlank() && user.getPassword() == null) ) {
            return true;
        }
        return false;
	}

	@Override
	public void signUp(User user) {
		userService.add(user);
        int random = (int)Math.floor(Math.random()*9999);
        String dogrulamaKodu = user.getName().substring(0, 1) + ""+user.getId()+""+user.getLastname().substring(0, 1)+""+random;
        System.out.println("Doðrulama Kodu: "+dogrulamaKodu);
        user.setVerifyCode(dogrulamaKodu);
		
	}

	@Override
	public void verify(User user, String code) {
		User verifiedUser = userService.get(user.getId());
        if(verifiedUser.getVerifyCode() == code) {
            verifiedUser.setVerified(true);
            System.out.println("Kod doðrulandý");
            return;
        }
        System.out.println("Doðrulama Kodu Hatalý");
		
	}
	
	
	

}
