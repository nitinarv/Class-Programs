package module.everything.thread;

public class ClassPractice2 {
	public static void main(String[] args) {
		MathOper math = new MathOper();
		
		FactorialThread t1 = new FactorialThread(math, 4);
		FactorialThread t2 = new FactorialThread(math, 6);
		
		AddThread t3 = new AddThread(math, 4, 5);
		AddThread t4 = new AddThread(math, 20, 10);
		
		t2.start();
		t3.start();
		t1.start();
		t4.start();
		
		
	}
}

class FactorialThread extends Thread{
	int number;
	MathOper math;
	public FactorialThread(MathOper math, int number) {
		this.number = number;
		this.math = math;
	}
	
	@Override
	public void run() {
		math.processFactorial(number);
	}
}

class AddThread extends Thread{
	int a , b;
	MathOper math;
	public AddThread(MathOper math, int a, int b) {
		this.a = a;
		this.b = b;
		this.math = math;
	}
	
	@Override
	public void run() {
		math.processAdd(a, b);
	}
}


class MathOper{
	int processFactorial( int number) {
		int result = 1;
		synchronized(this) {
		
		for(int i = number ; i>0 ; i--) {
			result *=i;
		}
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
				
		}
		}
		System.out.println("Factorial of "+number + " is "+result);
		return result;
	}
	
	int processAdd(int a , int b) {
		int result = 0;
		synchronized(this) {
		result = a + b;
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
				
		}
		}
		System.out.println("Addition of numbers "+a+ " "+b+" is "+result);
		return result;
	}
}

