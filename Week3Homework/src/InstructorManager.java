
public class InstructorManager extends UserManager {
	
	
	public void login(Instructor instructor) {
		
		System.out.println("E�itmen giri�i ba�ar�l� :  " +instructor.getEmail() +" " +instructor.getFirstName()+" "+instructor.getLastName());
		
	}
	

	public void register(Instructor instructor) {
		
		System.out.println("E�itmen kayd� ba�ar�l� : "+instructor.getEmail() +" " +instructor.getFirstName()+" "+instructor.getLastName());
		
	}
	
	
	
}
