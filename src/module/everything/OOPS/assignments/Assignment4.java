package module.everything.OOPS.assignments;

public class Assignment4 {

	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone();
		
		smartPhone.call();
		smartPhone.lift();
		smartPhone.discounnected();

	}

}

abstract class Telephone {
	public abstract void call();
	public abstract void lift();
	public abstract void discounnected();
}

class SmartPhone extends Telephone{

	@Override
	public void call() {
		System.out.println("SmartPhone Call");
	}

	@Override
	public void lift() {
		System.out.println("SmartPhone Lift");
	}

	@Override
	public void discounnected() {
		System.out.println("SmartPhone Disconnected");
	}
}
