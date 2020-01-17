package modell;

public class User {
	private String firstname; //object properties
	private String lastname;
	private String username;
	private String password;
	//String confirmpassword;
	private String email;
	private String mobile;     
	
	//empty constructor also called as default constructor
	
	public User() { //constructor
		//super();       
		this.firstname = firstname; //this refers to user 
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.email = email;
		this.mobile = mobile;
	}
	
	//getters can be also called as accessors
	//setters can be also called as mutators
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public void display() {
		System.out.println("First Name : "+this.firstname); //attributes of user
		System.out.println("Last name : "+this.lastname);
		System.out.println("User Name :"+this.username);
		System.out.println("Password : "+this.password);
		System.out.println("Email : "+this.email);
		System.out.println("Mobile Number : "+this.mobile);
	}
	
	
}
