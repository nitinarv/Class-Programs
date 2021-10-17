package module.everything.regx;

import java.util.regex.Pattern;

public class Regex2 {
	
	/**
	 * Validate the given email id (that should have pattern with @ and .com)
	 * a. firstname@gmail.com
	 * b. virendra@gmail.com
	 * c. test123prepare@co.edu.com
	 * 
	 * Validate the phone number with the country code +91 pattern in the start
	 * 
	 *  password with 10 length htat should have - 
	 *  first letter caps 
	 *  / contain 3 digits
	 *  / contains any number of alphabets also
	 * */
	public static void main(String[] args) {
		
		String email_pattern = "^+[91]{1}[0-9]{10}";
		System.out.println("email case 1: "+Pattern.matches(email_pattern, "firstname@gmail.com"));
		System.out.println("email case 2: "+Pattern.matches(email_pattern, "virendra@gmail.com"));
		System.out.println("email case 3: "+Pattern.matches(email_pattern, "test123prepare@co.edu.com"));
		
		
		String phone_pattern = "^\\+[91]{1}[0-9]{10}";
		System.out.println("phone case 1: "+Pattern.matches(phone_pattern, "+91 9880833742"));
		System.out.println("phone case 2: "+Pattern.matches(phone_pattern, "37826482736482"));
		System.out.println("phone case 3: "+Pattern.matches(phone_pattern, "+2 dis"));
		
		
		String password_pattern = "";
		System.out.println("pass case 1: "+Pattern.matches(password_pattern, "Ui84973dfkjdfds"));
		System.out.println("pass case 2: "+Pattern.matches(password_pattern, "7"));
		System.out.println("pass case 3: "+Pattern.matches(password_pattern, "g"));
		

	}

}
