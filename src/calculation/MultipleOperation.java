package calculation;

import java.util.List;

import calculation.Operation;

/**
 * It's an class who extends Operation and resolve a multiple Operation.
 * (multiple = more than one operation)
 */
public class MultipleOperation extends Operation {

	private List<SimpleOperation> op;
	private char[] type = { '+', '-', '*', '/' };

	/** Constructor with a String parameter */
	public MultipleOperation(String s) {
		super(s);
	}

	@Override
	public long result() {
		// TODO Auto-generated method stub
		return 0;
	}
}
