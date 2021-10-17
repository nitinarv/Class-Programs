package module.everything.strng.assignments;

public class Assignment1 {
	public static void main(String[] args) {
		String t = "Delhi";
		String o = "Mumbai";
		String k = "delhi";
		String y = new String("Mumbai");
		String l = new String("delhi");
		String p = new String("Hello");
		String q = "delhi";
		
		
		checkObjects('o', o, 'l', l);
		checkObjects('y', y, 'p', p);
		checkObjects('t', t, 'o', o);
		checkObjects('k', k, 'y', y);
		checkObjects('p', p, 'y', y);
	}
	
	
	public static void checkObjects(char varname1, String a,char varname2,  String b) {
		if(a == b) {
			System.out.println(varname1 +" == "+varname2 +" : true");
		}else {
			System.out.println(varname1 +" == "+varname2 +" : false");
		}
		
		if(a.equals(b)) {
			System.out.println(varname1 +".equals("+varname2+") : true");	
		}else {
			System.out.println(varname1 +".equals("+varname2+") : false");	
		}
		System.out.println("\n");
	}
}
