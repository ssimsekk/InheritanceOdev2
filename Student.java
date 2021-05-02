package InheritanceOdev2;

public class Student extends User {
	private String universityName;
	
	public Student() {
		
	}

	public Student(int id, String firstName, String lastName, String emailAddress, String universityName) {
		super(id, firstName, lastName, emailAddress);
		this.universityName = universityName;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
}
