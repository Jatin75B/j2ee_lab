
public class student {
	String Name;
	String USN;
	int age;
	float cgpa;
	public student(String name, String uSN, int age, float cgpa) {
		super();
		Name = name;
		USN = uSN;
		this.age = age;
		this.cgpa = cgpa;
	}
	@Override
	public String toString() {
		return "student [Name=" + Name + ", USN=" + USN + ", age=" + age + ", cgpa=" + cgpa + "]";
	}
	
	
}
