import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("please input number of game board length");
		Scanner scannerLength = new Scanner(System.in);

		final int SCREEN_WIDTH = scannerLength.nextInt();

		final int SNAKE_STARTING_X = SCREEN_WIDTH / 2;

		GameScreen screen = new GameScreen(SCREEN_WIDTH);
		screen.InitScreen();

		Snake snake = new Snake('*', SNAKE_STARTING_X);
		screen.setObjectOnLocation(snake, snake.getX());

		Scanner scanner = new Scanner(System.in);
		char input;
		boolean isRunning = true;
		while (isRunning) {
			System.out.println("game started please press 'l' for going to the left or press 'r' for going to the right : " );
			screen.PrintScreen();
			switch (input = scanner.nextLine().charAt(0)) {
				case 'l':
					snake.moveLeft(screen, snake);
					break;
				case 'r':
					snake.moveRight(screen, snake);
					break;
			}
		}
	}
}
