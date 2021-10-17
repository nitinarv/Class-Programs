package module.everything.constructor.assignments;

public class Assignment3 {

	public static void main(String[] args) {
		Student s1 = new Student("Ravi", 22, 'K', 'M', 12, 56, 43);
		Student s2 = new Student("Rasha", 21, 'A', 'F', 0, 87, 92);
		Student s3 = new Student("Allen", 23, 'G', 'M', 0, 38, 64);
		Student s4 = new Student("Boe", 19, 'B', 'F', 87, 99, 78);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}

class Student {
	private String name;
	private int age;
	private char section;
	private char gender;
	private int subject1;
	private int subject2;
	private int subject3;

	public Student(String name, int age, char section, char gender, int subject1, int subject2, int subject3) {
		super();
		this.name = name;
		this.age = age;
		this.section = section;
		this.gender = gender;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
	}

	public int totalMarks() {
		return subject1 + subject2 + subject3;
	}
	
	public float percentage() {
		return (totalMarks() / 3);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", totalMarks=" + totalMarks() + ", percentage=" + percentage()+ "]";
	}
}
