package module.everything.datastructure;

import java.util.ArrayList;
import java.util.List;

public class DeQueueProgram {
	/**
	 * Can add or remove from either side
	 * */
	private List<Integer> deque = new ArrayList<Integer>();

	public void insertFront(int item) {
			
	}
	
	public void insertRear(int item) {
		
	}
	
	public void removeFront() {
		deque.remove(0);
		
	}
	
	public void removeRear() {
		if(!deque.isEmpty())
		deque.remove(deque.size() -1);
	}
	
	public void peekFront() {}
	
	public void peekRear() {}
	

	public static void main(String[] args) {
		

	}

}
