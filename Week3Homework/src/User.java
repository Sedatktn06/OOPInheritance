
public class User {
	
	private int id;
	private String email;
	private int age;
	private String lesson;
	
	
	public User(int id, int age, String lesson,String email) {
		this();
		this.id = id;
		this.email=email;
		this.age = age;
		this.lesson = lesson;
	}



	public User() {
		
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLesson() {
		return lesson;
	}
	public void setLesson(String lesson) {
		this.lesson = lesson;
	}

}
