package day3;

public class User {
	
	private int userId;
	private String firsName;
	private String lastName;
	private String email;
	private String country;
	private int age;
	private int password;
	
	
	public User(int userId, String firsName, String lastName, String email, String country, int age,int password) {
		super();
		this.userId = userId;
		this.firsName = firsName;
		this.lastName = lastName;
		this.email = email;
		this.country = country;
		this.age = age;
		this.password = password;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFirsName() {
		return firsName;
	}
	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	
	

}
