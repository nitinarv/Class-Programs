package module.everything.accessmodifier.assignments;

public class N {
	protected long n_long;
	public int n_int;
	double n_double;

	public N(long n_long, int n_int, double n_double) {
		super();
		this.n_long = n_long;
		this.n_int = n_int;
		this.n_double = n_double;
	}
	
	public void n_function1() {
		
	}

	@Override
	public String toString() {
		return "N [n_long=" + n_long + ", n_int=" + n_int + ", n_double=" + n_double + "]";
	}
}
