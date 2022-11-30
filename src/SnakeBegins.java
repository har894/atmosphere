import java.io.IOException;
import java.util.Arrays;

public class SnakeBegins {

    public static void main(String[] args) throws IOException {
        //some code
        System.out.println("Game is starting...\n press <f> to forward, <b> to backward");
        MyLogger.log("Game starts");
        int current = MethodsForSnake.startPosition();
        int map = MethodsForSnake.map();
        int snake = MethodsForSnake.snake();
        char[] mapLength = new char[map];
        char[] snakeLength = new char[snake];
        while(current <= (map - snake) && current >= 0) {
            Arrays.fill(mapLength, '-');
            for (int i = current; i < snakeLength.length + current; i++) {
                mapLength[i] = '*';
            }
            System.out.println(mapLength);
            current = current + MethodsForSnake.movement();
        }
        MethodsForSnake.endOfTheGame(current);
    }
}
