import java.io.IOException;
import java.util.Scanner;

public class MethodsForSnake {
    public static int map() {
        int map = Integer.parseInt(ReadFile.readConfigs(0));
        return map;
    }

    public static int snake() {
        int snake = Integer.parseInt(ReadFile.readConfigs(1));
        return snake;
    }

    public static int startPosition() {
        int start = Integer.parseInt(ReadFile.readConfigs(2));
        return start;
    }

    public static int movement() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String direction = scanner.next().toLowerCase();
        int move = 0;
        if (direction.equals("f")) {
            move = +1;
            Logger.log("\nSnake moved right");
        } else if (direction.equals("b")) {
            move = -1;
            Logger.log("\nSnake moved left");
        } else {
            System.out.println("Please type valid command");
            Logger.log("\nSnake didn't move");
        }
        return move;
    }

    public static void endOfTheGame(int current) throws IOException {
        int map = map();
        int snake = snake();
        if (current < (map - snake)) {
            System.out.println("Sorry, you lose");
            Logger.log("Player lost the game");
        } else if (current > (map - snake)) {
            System.out.println("Congrats, you WIN");
            Logger.log("Player won the game");
        }
    }
}