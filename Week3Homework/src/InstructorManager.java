
public class InstructorManager extends UserManager {
	
	
	public void login(Instructor instructor) {
		
		System.out.println("Eðitmen giriþi baþarýlý :  " +instructor.getEmail() +" " +instructor.getFirstName()+" "+instructor.getLastName());
		
	}
	

	public void register(Instructor instructor) {
		
		System.out.println("Eðitmen kaydý baþarýlý : "+instructor.getEmail() +" " +instructor.getFirstName()+" "+instructor.getLastName());
		
	}
	
	
	
}
