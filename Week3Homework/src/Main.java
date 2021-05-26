

public class Main {

	public static void main(String[] args) {
		
		
		Instructor instructor=new Instructor(120, "Add Student", 1, "Engin", "Demiroğ", 35, "JAVA","engin@gmail.com");
		Instructor instructor2=new Instructor(130, "Add Student", 1, "Mehmet", "Karadağ", 35, "JAVA","engin@gmail.com");
		
		Student student=new Student("Erciyes Üniversitesi", 2, "Sedat", "Kotan", 23, "JAVA","sedat@gmail.com");
		
		
		InstructorManager instructorManager=new InstructorManager();
		
		instructorManager.login(instructor);
		instructorManager.register(instructor);
		instructorManager.login(instructor2);
		instructorManager.register(instructor2);
		
		
		StudentManager studentManager=new StudentManager();
		StudentManager studentManager2=new StudentManager();
		
		studentManager.register(student);
		studentManager.login(student);
		studentManager.login(student2);
	}

}
