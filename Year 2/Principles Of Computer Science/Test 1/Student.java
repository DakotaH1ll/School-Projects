public class Student extends Person {
	protected String name;
	protected char grade;
	protected int age;

	public Student(String name, char grade, int age) {
		super(name);
		this.grade = grade;
		this.age = age;
	}

}
