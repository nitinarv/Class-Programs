package module.everything.OOPS.assignments;

public class Assignment2 {
	public static void main(String[] args) {
		Hello helloInstance = new Hello();
		
		helloInstance.method1();
		helloInstance.method2();
		helloInstance.mncMethod();
		helloInstance.helloMethod();
		
		
	}
}

abstract class MNC {
	public MNC() {
		System.out.println("MNC Constructor");
	}
	
	abstract void method1();
	
	abstract void method2();
	
	public void mncMethod() {
		System.out.println("MNC Normal Method");	
	}
}

abstract class Infosys extends MNC{

	@Override
	void method1() {
		System.out.println("Infosys override of abstract Method1");
		
	}
}

class Hello extends Infosys{

	@Override
	void method2() {
		System.out.println("Hello override of abstract Method2");
		
	}
	
	public void helloMethod() {
		System.out.println("Hello Normal Method");		
	}
}