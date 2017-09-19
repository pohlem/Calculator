package calculation;

public class Calculator {
	private String s;
	private char[] type = { '+', '-', '*', '/' };

	public Calculator() {
	}

	public void doCalculation(String s) {
		Operation op = this.whatOperation(s);
		System.out.println(op.result());
	}

	public Operation whatOperation(String s) {
		int numberOfType = numberType(s);
		if (numberOfType <= 1) {
			return new SimpleOperation(s);
		}
		return new MultipleOperation(s);
	}

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
