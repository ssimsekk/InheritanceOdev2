package InheritanceOdev2;

public class Instructor extends User {
	private String profession;
	
	public Instructor() {
		
	}

	public Instructor(int id, String firstName, String lastName, String emailAddress, String profession) {
		super(id, firstName, lastName, emailAddress);
		this.profession = profession;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}
}
