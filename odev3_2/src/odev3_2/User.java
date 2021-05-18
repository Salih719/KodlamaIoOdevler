package odev3_2;

public class User {
	private int id;
	private String FirstName;
	private String LastName;
	
	
	public User() {
		
	}
	
	public User(int id, String FirstName, String LastName) {
		super();
		this.id= id;
		this.FirstName = FirstName;
		this.LastName = LastName;
		
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
}
