package calculation;

/** It's the class for the calculator. */
public class Calculator {
	private String s;
	private char[] type = { '+', '-', '*', '/' };

	/** Constructor */
	public Calculator() {
	}

	/**
	 * Show the result of the Operation.
	 * 
	 * @param s
	 *            String (the operation)
	 */
	public void doCalculation(String s) {
		Operation op = this.whatOperation(s);
		System.out.println(op.result());
	}

	/**
	 * Determine if the Operation is a SingleOperation or a MultipleOperation.
	 * 
	 * @param s
	 *            String (the operation)
	 * @return Operation
	 */
	public Operation whatOperation(String s) {
		int numberOfType = numberType(s);
		if (numberOfType <= 1) {
			return new SimpleOperation(s);
		}
		return new MultipleOperation(s);
	}

	/**
	 * Function use for determine how many operations is in the parameter String.
	 * 
	 * @param s
	 *            String (the operation)
	 * @return int (Number of +,-,*,/)
	 */
	private int numberType(String s) {
		int numberOfType = 0;
		for (int i = 0; i < s.length(); i++) {
			for (char c : type)
				if (s.charAt(i) == c) {
					numberOfType += 1;
					break;
				}
		}
		return numberOfType;
	}
}
