package calculation;

public abstract class Operation {
	protected String s;

	public Operation() {
	};

	public Operation(String s) {
		this.s = s;
	}
	
	public abstract long result();
	
	public String toString() {
		return "Operation : "+s;
	}
}
