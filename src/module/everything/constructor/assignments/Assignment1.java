package module.everything.constructor.assignments;

public class Assignment1 {

	public static void main(String[] args) {
		System.out.println("Function overloading");
		Assignment1 assignment1 = new Assignment1();

		System.out.println("Add " + assignment1.calculate(1, 2));
		System.out.println("Circle area " + assignment1.calculate(2.3d));
		System.out.println("Rectangle area " + assignment1.calculate(4.2f, 4f));
	}

	// Add two numbers return int
	public int calculate(int a, int b) {
		return 1;
	}

	// calculate area of a circle , return float,
	public float calculate(double radius) {
		return (float) (Math.PI * Math.pow(radius, 2));
	}

	// calculate area of rectangle , return int
	public int calculate(float length, float breadth) {
		return (int) (length * breadth);
	}

}
