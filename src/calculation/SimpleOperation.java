package calculation;

/**
 * It's an class who extends Operation and resolve a simple Operation. (simple =
 * one operation)
 */
public class SimpleOperation extends Operation {
	private char[] type = { '+', '-', '*', '/' };

	/** Constructor with a String parameter */
	public SimpleOperation(String s) {
		super(s);
	}

	/**
	 * Do the calculation of the operation.
	 * 
	 * @param sep
	 *            long[] (Numbers of the operation)
	 * @param type2
	 *            char (Type of the operation)
	 * @return long (the result of the operation)
	 */
	public long calculation(long[] sep, char type2) {
		switch (type2) {
		case '+':
			return sep[0] + sep[1];
		case '-':
			return sep[0] - sep[1];
		case '*':
			return sep[0] * sep[1];
		case '/':
			return sep[0] / sep[1];
		case ' ':
			return sep[0];
		default:
			return (long) 0;
		}
	}

	/**
	 * Determine if the calculation to do is an add, a soustract...
	 * 
	 * @return char (the sign of the calculation)
	 */
	public char whatCalculation() {
		for (int i = 0; i < s.length(); i++) {
			for (char c : type) {
				if (s.charAt(i) == c) {
					return c;
				}
			}
		}
		return ' ';
	}

	public long result() {
		long[] sep;
		char typeOperation = this.whatCalculation();
		sep = StringToLong(s.split("\\" + typeOperation));
		return calculation(sep, typeOperation);
	}

	/**
	 * Transform a String array into a long array.
	 * 
	 * @param tabS
	 *            String[] (the numbers of the operation).
	 * @return long[]
	 */
	private long[] StringToLong(String[] tabS) {
		long[] tabL = new long[tabS.length];
		for (int i = 0; i < tabS.length; i++) {
			tabL[i] = Long.parseLong(tabS[i]);
		}
		return tabL;
	}

}
