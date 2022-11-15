public class GameObject {

	private int x;
	private char symbol;

	public int getX() {
		return this.x;
	}

	public char getSymbol() {
		return symbol;
	}

	public void setX(int newLocation) {
		this.x = newLocation;
	}

	public void setSymbol(char newSymbol) {
		this.symbol = newSymbol;
	}
}
