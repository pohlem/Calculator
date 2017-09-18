package calculation;

import java.util.List;

import calculation.Operation;

public class MultipleOperation extends Operation{
	
	private List<SimpleOperation> op;

	public MultipleOperation(String s) {
		super(s);
	}

}
