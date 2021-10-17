package module.everything.exceptn.assignments;

import java.util.Scanner;

/**
 * You need to check the salary of the person and based on that need to return the ouput from the program. 
 * if salary < 2100 then return custom exception
 * message as "you need to work hard" 
 * 
 * if salary is between 2100 and 5000 then
 * return custom exception message as "you salary has to go up" 
 * 
 * if salary is
 * between 5100 and 9000 then return custom exception message as "salary is very
 * good"
 * 
 */

class SalaryException extends Exception {
	public SalaryException(String message) {
		super(message);
	}
}

public class Assignment1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // taking user input from console

		System.out.println("Enter Salary : ");
		int salary = scanner.nextInt();

		try {
			if (salary > 5100 && salary < 9000) {
				throw new SalaryException("salary is very good");
			} else if (salary > 2100 && salary < 5000) {
				throw new SalaryException("Your salary needs to go up");
			} else if (salary < 2100) {
				throw new SalaryException("You need to work harder");
			} else {
				System.out.println("You dont need to work");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
