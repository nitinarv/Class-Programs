package module.everything.constructor.assignments;

public class Assignment4 {
	public static void main(String[] args) {
		A a = new A(12, 56, 43);
		B b = new B(87, 99, 78, 64);

		System.out.println("A "+a);
		System.out.println("B "+b);
	}
}

abstract class Marks {
	public abstract float getPercentage();
}

class A extends Marks {
	private int subject1;
	private int subject2;
	private int subject3;

	public A(int subject1, int subject2, int subject3) {
		super();
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
	}

	@Override
	public float getPercentage() {
		return (subject1 + subject2 + subject3) / 3;
	}

	@Override
	public String toString() {
		return "A [getPercentage=" + getPercentage() + "]";
	}
}

class B extends Marks {

	private int subject1;
	private int subject2;
	private int subject3;
	private int subject4;

	public B(int subject1, int subject2, int subject3, int subject4) {
		super();
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		this.subject4 = subject4;
	}

	@Override
	public float getPercentage() {
		return (subject1 + subject2 + subject3 + subject4) / 4;
	}

	@Override
	public String toString() {
		return "B [getPercentage=" + getPercentage() + "]";
	}
}
