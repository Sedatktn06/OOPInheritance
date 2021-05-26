
public class Instructor extends User {
	
	private int numberStudent;
	private String claim;
	private String firstName;
	private String lastName;
	
	
	
	
	public Instructor(int numberStudent, String claim,int id, String firstName, String lastName, int age, String lesson,String email) {
		super(id,age,lesson,email);
		this.numberStudent = numberStudent;
		this.claim = claim;
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


	public int getNumberStudent() {
		return numberStudent;
	}
	

	public void setNumberStudent(int numberStudent) {
		this.numberStudent = numberStudent;
	}
	public String getClaim() {
		return claim;
	}
	public void setClaim(String claim) {
		this.claim = claim;
	}
	
	
}
