import java.util.Scanner;

public class MethodsForSnake {
    public static int map() {
        int map = 20;
        return map;
    }

    public static int snake() {
        int snake = 3;
        return snake;
    }

    public static int startPosition() {
        int start = 0;
        return start;
    }

    public static int movement() {
        Scanner scanner = new Scanner(System.in);
        String direction = scanner.next().toLowerCase();
        int move = 0;
        if (direction.equals("f")) {
            move = +1;
        } else if (direction.equals("b")) {
            move = -1;
        } else {
            System.out.println("Please type valid command");
        }
        return move;
    }

    public static void endOfTheGame(int current) {
        int map = map();
        int snake = snake();
        if (current < (map - snake)) {
            System.out.println("Sorry, you lose");
        } else if (current > (map - snake)) {
            System.out.println("Congrats, you WIN");
        }
    }
}