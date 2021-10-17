package module.everything.accessmodifier.assignments;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M m_var = new M(11,111L,11.11F);
		N n_var = new N(222L, 22, 22.222D);
		P p_var = new P();
		X x_var = new X(44, 444L, 44.44F, '4');
		Z z_var = new Z();
		
		z_var.print(m_var, n_var, p_var, x_var);
	}

}
