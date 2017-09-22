package calculation;

/** It's an abstract class for the Operation */
public abstract class Operation {
	protected String s;

	/** Constructor */
	public Operation() {
	};

	/** Constructor with a String parameter */
	public Operation(String s) {
		this.s = s;
	}

	/**
	 * Give the result of the current Operation.
	 * 
	 * @return long (the result)
	 */
	public abstract long result();

	public String toString() {
		return "Operation : " + s;
	}
}
