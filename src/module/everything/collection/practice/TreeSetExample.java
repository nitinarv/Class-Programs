package module.everything.collection.practice;

import java.util.HashSet;
import java.util.TreeSet;

class TreeSetExample{
	public static void main(String[] args){
		
		//LinkedHashSet<String> hs=new LinkedHashSet<String>();
//		TreeSet<String> hs=new TreeSet<String>();
		TreeSet hs=new TreeSet();
		
		hs.add("d");
		hs.add("c");
		hs.add("b");
		hs.add("a");
		hs.add("c");
		hs.add("i");
		hs.add("l");
		hs.add(new Integer(2));
		hs.add(new Float(2));
		
				
		System.out.println("Hashset is "+hs);
		System.out.println("Size of Hashset is "+ hs.size());
		
		System.out.println("Does hashset contains this 'u' element  " + hs.contains("u"));		
		System.out.println("is hashset empty  " + hs.isEmpty());
		System.out.println("remove the element "+hs.remove("i"));
		
		
	    hs.clear();
	    System.out.println("get class  " +hs.getClass());
		
	    System.out.println("is hashset empty  " +hs.isEmpty());
	    
	    
		
	}
}
