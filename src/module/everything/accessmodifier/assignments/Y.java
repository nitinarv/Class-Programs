package module.everything.accessmodifier.assignments;

public class Y {
	
	public void print(M m_var, N n_var) {
		System.out.println("M [m_int=" + m_var.m_int + ", m_long=" + m_var.m_long + ", m_float=" + m_var.m_float + "]");
		m_var.m_function1();
		
		System.out.println("N [n_long=" + n_var.n_long + ", n_int=" + n_var.n_int + ", n_double=" + n_var.n_double + "]");
		n_var.n_function1();
	}
}
