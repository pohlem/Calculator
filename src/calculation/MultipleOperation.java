package calculation;

import java.util.List;

import calculation.Operation;

public class MultipleOperation extends Operation{
	
	private List<SimpleOperation> op;
	private char[] type = { '+', '-', '*', '/' };

	public MultipleOperation(String s) {
		super(s);
	}

	@Override
	public long result() {
		// TODO Auto-generated method stub
		return 0;
	}
}
