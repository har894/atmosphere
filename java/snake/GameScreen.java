public class GameScreen {

	private int width;
	private char[] screenMatrix;

	public GameScreen(int width) {
		this.width = width;
		this.screenMatrix = new char[this.width];
	}

	public void InitScreen() {
			for (int j = 0; j < this.width; j++) {
				this.screenMatrix[j] = '-';
			}
	}

	public void PrintScreen() {
			for (int j = 0; j < this.width; j++) {
				System.out.print(this.screenMatrix[j]);
			}
			System.out.println();
	}

	public void ClearScreenLocation(int x) {
		this.screenMatrix[x] = '-';
	}

	public void setObjectOnLocation(GameObject object, int x) {
		this.screenMatrix[x] = object.getSymbol();
	}
}
