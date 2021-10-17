package module.everything.accessmodifier.practice;

public class Assisted1 {

	public static void main(String[] args) {
		System.out.println("Default access Specifier");
		
		defAccessSpecifier obj1 = new defAccessSpecifier();
		obj1.display();
		
		privateAccessSpecifier obj2 = new privateAccessSpecifier();
//		obj2.display();
		
		

		
	}

}

class defAccessSpecifier{
	void display() {
		System.out.println("You are using default access specifier");
	}
}

class privateAccessSpecifier{
	private void display() {
		System.out.println("you are using private access specifier");
	}
}

