package odev3_2;

public class Main {

	public static void main(String[] args) {
		
		User user = new User();
		user.setId(1);
		user.setFirstName("Salih Mehmet");
		user.setLastName("Kurt");
		
		Student student = new Student();
		student.setFirstName("Salih Mehmet");
		student.setId(2);
		student.setLastName("Kurt");
		student.setLessons("türkçe","matematik","ingilizce");
		System.out.println(student.getFirstName());
		
	}

}
