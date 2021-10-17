package module.everything.constructor.assignments;

public class Assignment2 {

	Integer a;
	Integer b;
	Float radius;

	public Assignment2() {
		super();
	}

	public Assignment2(Integer a) {
		super();
		this.a = a;
	}

	public Assignment2(Integer a, Integer b) {
		super();
		this.a = a;
		this.b = b;
	}

	public Assignment2(Float radius) {
		super();
		this.radius = radius;
	}

	public Assignment2(Integer a, Integer b, Float radius) {
		super();
		this.a = a;
		this.b = b;
		this.radius = radius;
	}

	public static void main(String[] args) {
		Assignment2 assignment2 = new Assignment2(10, 20, 4.4f);
		System.out.println("Square area "+assignment2.areaSquare());
		System.out.println("Rectangle area "+assignment2.areaRectangle());
		System.out.println("Circle area "+assignment2.areaCircle());
	}

	public int areaSquare() {
		return (int) Math.pow(a, 2);
	}

	public int areaRectangle() {
		return (int) (a * b);
	}

	public float areaCircle() {
		return (float) (Math.PI * Math.pow(radius, 2));
	}
}
