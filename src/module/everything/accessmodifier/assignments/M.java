package module.everything.accessmodifier.assignments;

public class M {
	private int m_int;
	long m_long;
	protected float m_float;

	public M(int m_int, long m_long, float m_float) {
		super();
		this.m_int = m_int;
		this.m_long = m_long;
		this.m_float = m_float;
	}

	public void m_function1() {
		
	}
	
	@Override
	public String toString() {
		return "M [m_int=" + m_int + ", m_long=" + m_long + ", m_float=" + m_float + "]";
	}
}
