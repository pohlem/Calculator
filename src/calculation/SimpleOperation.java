package calculation;

public class SimpleOperation extends Operation {
	private char[] type = { '+', '-', '*', '/' };

	public SimpleOperation(String s) {
		super(s);
	}

	public long doOperation() {
		long[] sep;
		char typeOperation = this.whatCalculation();
		sep = StringToLong(s.split("\\" + typeOperation));
		return calculation(sep,typeOperation);

	}

	public long calculation(long[] sep, char type2) {
		switch(type2){
		case '+' : return sep[0]+sep[1];
		case '-' : return sep[0]-sep[1];
		case '*' : return sep[0]*sep[1];
		case '/' : return sep[0]/sep[1];
		case ' ' : return sep[0];
		default : return (long) 0;
		}
	}

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
		return doOperation();
	}

	private long[] StringToLong(String[] tabS) {
		long[] tabL = new long[tabS.length];
		for (int i = 0; i < tabS.length; i++) {
			tabL[i] = Long.parseLong(tabS[i]);
		}
		return tabL;
	}

}
