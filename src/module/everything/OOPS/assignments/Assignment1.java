package module.everything.OOPS.assignments;

public class Assignment1 {
	public static void main(String[] args) {
		
		Veh2W scooty = new Veh2W();
		Veh4W maruti = new Veh4W();
		Veh3W agro = new Veh3W();
		Veh8W eicher = new Veh8W();

		scooty.display();
		scooty.fuel();
		scooty.run();
		scooty.stop();
		
		maruti.display();
		maruti.fuel();
		maruti.run();
		maruti.stop();
		
		agro.display();
		agro.fuel();
		agro.run();
		agro.stop();
		
		eicher.display();
		eicher.fuel();
		eicher.run();
		eicher.stop();
		
		

	}

	

}

abstract class Vehicle {
	String type = "Land";
	
	public abstract void run();

	public abstract void stop();
	
	public void fuel() {
		System.out.println("Fuelling up...");
	}
}

class Veh2W extends Vehicle {
	int speed;
	long distance;
	int nos_of_tyre;
	
	public Veh2W() {
		super();
		this.speed = 20;
		this.distance = 200L;
		this.nos_of_tyre = 2;
	}

	@Override
	public void run() {
		System.out.println(this.getClass().getSimpleName()+" started its engines");

	}

	@Override
	public void stop() {
		System.out.println(this.getClass().getSimpleName()+" stopped its engines and hit its breaks");

	}

	public void display() {
		System.out.println("Veh2W [type="+super.type+", speed=" + speed + ", distance=" + distance + ", nos_of_tyre=" + nos_of_tyre + "]");
	}
}

class Veh3W extends Vehicle {
	int speed;
	long distance;
	int nos_of_tyre;
	
	public Veh3W() {
		super();
		this.speed = 30;
		this.distance = 300L;
		this.nos_of_tyre = 3;
	}

	@Override
	public void run() {
		System.out.println(this.getClass().getSimpleName()+" started its engines");

	}

	@Override
	public void stop() {
		System.out.println(this.getClass().getSimpleName()+" stopped its engines and hit its breaks");

	}
	public void display() {
		System.out.println("Veh3W [type="+super.type+", speed=" + speed + ", distance=" + distance + ", nos_of_tyre=" + nos_of_tyre + "]");
	}
}

class Veh4W extends Vehicle {
	int speed;
	long distance;
	int nos_of_tyre;
	
	
	public Veh4W() {
		super();
		this.speed = 40;
		this.distance = 400L;
		this.nos_of_tyre = 4;
	}

	@Override
	public void run() {
		System.out.println(this.getClass().getSimpleName()+" started its engines");

	}

	@Override
	public void stop() {
		System.out.println(this.getClass().getSimpleName()+" stopped its engines and hit its breaks");

	}
	
	public void display() {
		System.out.println("Veh4W [type="+super.type+", speed=" + speed + ", distance=" + distance + ", nos_of_tyre=" + nos_of_tyre + "]");
	}

}

class Veh8W extends Vehicle {
	int speed;
	long distance;
	int nos_of_tyre;
	
	public Veh8W() {
		super();
		this.speed = 80;
		this.distance = 800L;
		this.nos_of_tyre = 8;
	}

	@Override
	public void run() {
		System.out.println(this.getClass().getSimpleName()+" started its engines");

	}

	@Override
	public void stop() {
		System.out.println(this.getClass().getSimpleName()+" stopped its engines and hit its breaks");

	}
	public void display() {
		System.out.println("Veh8W [type="+super.type+", speed=" + speed + ", distance=" + distance + ", nos_of_tyre=" + nos_of_tyre + "]");
	}
}
