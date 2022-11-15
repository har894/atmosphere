public class Snake extends GameObject {

	public Snake(char symbol, int xStartingLocation) {
		setSymbol(symbol);
		setX(xStartingLocation);
	}

	public void moveLeft(GameScreen screen, Snake snake) {
		snake.setX(getX() - 1);
		screen.setObjectOnLocation(snake, snake.getX());
		screen.ClearScreenLocation(snake.getX() + 1);
	}

	public void moveRight(GameScreen screen, Snake snake) {
		snake.setX(getX() + 1);
		screen.setObjectOnLocation(snake, snake.getX());
		screen.ClearScreenLocation(snake.getX() - 1);
	}
}