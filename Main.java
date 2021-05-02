package InheritanceOdev2;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student(1, "S�leyman", "�im�ek", "suleyman@suleyman.com", "Osmangazi �niversitesi");
		System.out.println(student.getFirstName());
		
		StudentManager studentManager = new StudentManager();
		studentManager.login();
		studentManager.select();
		
		
		Instructor instructor = new Instructor();
		instructor.setId(2);
		instructor.setFirstName("Melis");
		instructor.setLastName("�im�ek");
		instructor.setEmailAddress("melis@melis.com");
		instructor.setProfession("OOP");
		System.out.println(instructor.getFirstName());
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.login();
		instructorManager.add();
	}
}
