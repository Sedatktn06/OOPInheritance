
public class Student extends User {

	private String school;
	private String firstName;
	private String lastName;
	
	

	public Student(String school,int id, String firstName, String lastName, int age, String lesson,String email) {
		super(id,age,lesson,email);
		this.school = school;
		this.firstName=firstName;
		this.lastName=lastName;
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



	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
	
	
}
