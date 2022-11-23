import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {

    public static final Logger log = Logger.getLogger("logs");

    public static void main(String[] args) throws IOException {


        log.info("Loge processes started");
        FileHandler logFile;
        logFile = new FileHandler("./infoLogFile.txt");
        log.addHandler(logFile);

        log.info("Game started");

        System.out.println("please input number of game board length");
        Scanner scannerLength = new Scanner(System.in);

        final int SCREEN_WIDTH = scannerLength.nextInt();

        final int SNAKE_STARTING_X = SCREEN_WIDTH / 2;

        log.info("Add game screen");
        GameScreen screen = new GameScreen(SCREEN_WIDTH);
        screen.InitScreen();

        log.info("Snake element one");
        Snake snake = new Snake('*', SNAKE_STARTING_X);
        screen.setObjectOnLocation(snake, snake.getX());

        log.info("Snake element two");
        Snake snake1 = new Snake('*', SNAKE_STARTING_X + 1);
        screen.setObjectOnLocation(snake1, snake1.getX());

        log.info("Snake element three");
        Snake snake2 = new Snake('*', SNAKE_STARTING_X + 2);
        screen.setObjectOnLocation(snake2, snake2.getX());

        Scanner scanner = new Scanner(System.in);
        char input;
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("game started please press 'l' for going to the left or press 'r' for going to the right : ");
            screen.PrintScreen();
            switch (input = scanner.nextLine().charAt(0)) {
                case 'l':
                    log.info("Snake move left");
                    snake.moveLeft(screen, snake);
                    snake1.moveLeft(screen, snake1);
                    snake2.moveLeft(screen, snake2);
                    break;
                case 'r':
                    log.info("Snake move right");
                    snake2.moveRight(screen, snake2);
                    snake1.moveRight(screen, snake1);
                    snake.moveRight(screen, snake);
                    break;
            }
        }
    }
}
