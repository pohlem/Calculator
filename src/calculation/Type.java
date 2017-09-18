package calculation;

public enum Type {
	ADD('+'), SUBSTRACT('-'), MULTIPLE('x'), DIVIDE('/');

	private Character c;

	Type(Character c) {
		this.c = c;
	}

	Character getType() {
		return c;	}
}
