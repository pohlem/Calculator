package calculation;

import calculation.SimpleOperation;

public class Operation {
	private String s;
	private char[] type = { '+', '-', '*', '/' };

	public Operation() {
	};

	public Operation(String s) {
		this.s = s;
	}

	public Operation whatOperation(String s) {
		int numberOfType = numberType(s);
		if (numberOfType == 1) {
			return new SimpleOperation(s);
		}
		return new MultipleOperation(s);
	}
	
	public String toString() {
		return "Operation [s=" + s + "]";
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
