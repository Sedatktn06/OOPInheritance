
public class StudentManager extends UserManager {

	
	public void login(Student student) {
		
		System.out.println("��renci giri�i ba�ar�l� : " +student.getEmail() +" " +student.getFirstName()+" "+student.getLastName());
		
	}
	

	public void register(Student student) {
		
		System.out.println("��renci kayd� ba�ar�l� : " +student.getEmail() +" " +student.getFirstName()+" "+student.getLastName());
		
	}
	
	
}
