package module.everything.thread;

public class ClassPractice1 {

	public static void main(String[] args) {

		
		SleepThread s1 = new SleepThread("One");
		SleepThread s2 = new SleepThread("Two");
		SleepThread s3 = new SleepThread("Three");
		
		s1.start();
		s2.start();
		s3.start();
		
		System.out.println(s1.getState());
		System.out.println(s2.getState());
		System.out.println(s3.getState());
	}

}


class SleepThread extends Thread{
	String name;
	
	public SleepThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i =1 ; i<5;i++) {
		try {
			System.out.println(name+ " "+ this.getId()+ " Started..");
			Thread.sleep(2000);
			System.out.println(name+ " "+ this.getId()+ " Finished..");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getStackTrace());
		}
		}
		
		System.out.println(name+ " "+ this.getName()+ " Block bottom..");	
	}
}