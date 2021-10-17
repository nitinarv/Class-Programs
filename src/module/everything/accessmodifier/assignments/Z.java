package module.everything.accessmodifier.assignments;

public class Z {

	public void print(M m_var, N n_var, P p_var, X x_var) {
		System.out.println("M [m_int=" + m_var.m_int + ", m_long=" + m_var.m_long + ", m_float=" + m_var.m_float + "]");
		m_var.m_function1();
		
		System.out.println("N [n_long=" + n_var.n_long + ", n_int=" + n_var.n_int + ", n_double=" + n_var.n_double + "]");
		n_var.n_function1();
		
		p_var.print(m_var, n_var);
		
		System.out.println("X [x_int=" + x_var.x_int + ", x_long=" + x_var.x_long + ", x_float=" + x_var.x_float + ", x_char=" + x_var.x_char + "]");
	}
}
