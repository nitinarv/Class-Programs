package module.everything.exceptn.assignments;

import java.io.IOException;
import java.util.Scanner;

import module.everything.exceptn.assignments.MultipleCatchBlock.Operate;

public class ThrowClause {

	/**
	 * if numbers are equal then return num1 + num2 
	 * else if num1 > num2 throw IOException 
	 * else num2 > num1 throw Arithmatic exception
	 */

	public static void main(String[] args) {
		int result = 0;
		Scanner scanner = new Scanner(System.in); // taking user input from console

		System.out.println("Enter number 1 : ");
		int num1 = scanner.nextInt();

		System.out.println("Enter number 2 : ");
		int num2 = scanner.nextInt();

		if (num1 == num2) {
			System.out.println(num1 + num2);
		} else if (num1 > num2) {
			executeAndCheck(new Operate() {

				@Override
				public void execute() throws IOException {
					throw new IOException();
				}

			});
		} else {
			executeAndCheck(new Operate() {

				@Override
				public void execute() throws IOException {
					throw new ArithmeticException();
				}

			});
		}
	}

	public static void executeAndCheck(Operate operation) {
		try {
			operation.execute();
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		} catch (IOException e) {
			System.out.println("IOException Exception occurs");
		} catch (Exception e) {
			System.out.println("Parent Exception occurs");
		}
	}

	interface Operate {
		public void execute() throws IOException;
	}

}
