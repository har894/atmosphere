package src.das;

import java.util.Scanner;

public class SnakeGameMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of map: ");
        int lengthOfMap = scanner.nextInt();


        System.out.println("Please enter the item symbol for map: ");
        char itemSymbol = scanner.next().charAt(0);

        Map map = new Map();
        char[] gameMap = map.createMap(lengthOfMap, itemSymbol);

        System.out.println("Please enter the length of snake: ");
        int lengthOfSnake = scanner.nextInt();

        System.out.println("Please enter the item symbol for snake: ");
        char snakeSymbol = scanner.next().charAt(0);

        Snake snake = new Snake();
        char[] gameSnakes = snake.crateSnake(lengthOfSnake, snakeSymbol);
        int mapLength = gameMap.length;

        char[] game = new char[mapLength];

        int count = 0;
        for (char element : gameMap) {
            game[count] = element;
            count++;
        }

        System.out.println("Please enter the item index for snake: ");
        int index = scanner.nextInt();
        for (char element : gameSnakes) {
                game[index] = element;
                index++;
        }

        Print print = new Print();
        print.printMap(gameMap);
        System.out.println("\n");
        print.printMap(gameSnakes);
        System.out.println("\n");
        print.printMap(game);

    }
}
