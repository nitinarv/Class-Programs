package module.everything.accessmodifier.assignments;

public class X {
	private int x_int;
	long x_long;
	protected float x_float;
	public char x_char;

	public X(int x_int, long x_long, float x_float, char x_char) {
		super();
		this.x_int = x_int;
		this.x_long = x_long;
		this.x_float = x_float;
		this.x_char = x_char;
	}

	@Override
	public String toString() {
		return "X [x_int=" + x_int + ", x_long=" + x_long + ", x_float=" + x_float + ", x_char=" + x_char + "]";
	}
}
