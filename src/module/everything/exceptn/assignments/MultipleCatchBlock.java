package module.everything.exceptn.assignments;

import module.everything.exceptn.assignments.MultipleCatchBlock.Operate;

public class MultipleCatchBlock {
	public static void main(String[] args) {

		int a[] = new int[5];
		executeAndCheck(new Operate() {

			@Override
			public void execute() {
				a[5] = 30 / 0;
			}
		});

		executeAndCheck(new Operate() {

			@Override
			public void execute() {
				a[6] = 9;
			}
		});
	}

	public static void executeAndCheck(Operate operation) {
		try {
			operation.execute();
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		}

		catch (Exception e) {
			System.out.println("Parent Exception occurs");
		} finally {
			System.out.println("rest of the code");
		}
	}

	interface Operate {
		public void execute();
	}
}