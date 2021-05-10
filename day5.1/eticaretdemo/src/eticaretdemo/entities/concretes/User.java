package eticaretdemo.entities.concretes;

import eticaretdemo.entities.abstracts.Entity;

public class User implements Entity {
	
    private int id;
    private String name;
    private String lastname;
    private String email;
    private String password;
    private boolean isVerified = false;
    private String verifyCode;
    
	public User(int id, String name, String lastname, String email, String password, boolean isVerified,
			String verifyCode) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.isVerified = isVerified;
		this.verifyCode = verifyCode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isVerified() {
		return isVerified;
	}

	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}

	public String getVerifyCode() {
		return verifyCode;
	}

	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}
    
    
    

}
