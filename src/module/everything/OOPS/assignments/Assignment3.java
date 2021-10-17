package module.everything.OOPS.assignments;

public class Assignment3 {
	public static void main(String[] args) {
		FountainPen fountainPen = new FountainPen();
		
		fountainPen.refill();
		fountainPen.write();
		fountainPen.changeNib();
		
		Human human = new Human();
		
		human.jump();
		human.bite();
		human.eat();
		human.sleep();
	}
}

abstract class Pen{
	public abstract void write();

	public abstract void refill();

}

class FountainPen extends Pen{

	@Override
	public void write() {
		System.out.println("FountainPen Write");
		
	}

	@Override
	public void refill() {
		System.out.println("FountainPen Refill");
		
	}
	
	public void changeNib() {
		System.out.println("FountainPen ChangeNib");
	}
}

class Monkey{
	public void jump() {
		System.out.println("Monkey Jump");
	}
	
	public void bite() {
		System.out.println("Monkey Bite");	
	}
	
}

interface Animal{
	public void eat();
	public void sleep();
}

class Human extends Monkey implements Animal{
	
	 @Override
	public void jump() {
		System.out.println("Human Jump");
		super.jump();
	}
	 
	 @Override
	public void bite() {
		 System.out.println("Human Bite");
		 super.bite();
	}
	 
	 @Override
	public void eat() {
		 System.out.println("Human eat");		
	}
	 
	 @Override
	public void sleep() {
		 System.out.println("Human sleep");
		 }
	
}
