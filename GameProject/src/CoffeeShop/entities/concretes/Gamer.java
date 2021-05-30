package CoffeeShop.entities.concretes;

public class Gamer {
	
	private int id;
	private String firstName;
	private String lastName;
	private int timeOfBirth;
	private String nationalIdentity;
	
	
	
	public Gamer() { }


	public Gamer(int id, String firstName, String lastName, int timeOfBirth, String nationalIdentity) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.timeOfBirth = timeOfBirth;
		this.nationalIdentity = nationalIdentity;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getTimeOfBirth() {
		return timeOfBirth;
	}
	public void setTimeOfBirth(int timeOfBirth) {
		this.timeOfBirth = timeOfBirth;
	}
	public String getNationalIdentity() {
		return nationalIdentity;
	}
	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}
	
}
