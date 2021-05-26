
public class StudentManager extends UserManager {

	
	public void login(Student student) {
		
		System.out.println("Öğrenci girişi başarılı : " +student.getEmail() +" " +student.getFirstName()+" "+student.getLastName());
		
	}
	

	public void register(Student student) {
		
		System.out.println("Öğrenci kaydı başarılı : " +student.getEmail() +" " +student.getFirstName()+" "+student.getLastName());
		
	}
	
	
}
