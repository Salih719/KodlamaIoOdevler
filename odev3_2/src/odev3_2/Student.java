package odev3_2;

public class Student extends User {
	
	private String[] lessons;
	
	
	public Student() {
		
	}
	
	
	public String[] getLessons() {
		return lessons;
	}
	public void setLessons(String... lessons) {
		this.lessons = lessons;
	}

	
	
	
}
