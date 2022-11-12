import java.util.Scanner;

public class Learning_qtl {
    public static void main(String[] args) {

        char mapStructure;

        //map fields
        int mapLength;
        char[] map;
        mapLength = 30;

        mapStructure = '-';
        map = new char[mapLength];
        for (int i = 0; i < mapLength; i++) {
            map[i] = mapStructure;
        }

        //snake fields
        char snakeStructure;
        snakeStructure = '*';
        int snakeLength;
        snakeLength = 6;
        int snakeStartIndex;
        snakeStartIndex = 0;
        int snakeEndIndex = snakeStartIndex + snakeLength;

        //place snake
        int startPoint;
        startPoint = 0;
        for (int i = startPoint; i < startPoint + snakeLength; i++) {
            map[i] = snakeStructure;
        }
        System.out.println(map);

        while (map[mapLength - 1] == '-') {
            Scanner scan = new Scanner(System.in);
            String direction;
            do {
                System.out.println("give direction");
                direction = scan.next().toLowerCase();

            } while (!direction.contentEquals("f") & !direction.contentEquals("b"));


            if (direction.contentEquals("f")) {
                map[snakeStartIndex++] = mapStructure;
                map[snakeEndIndex++] = snakeStructure;
                System.out.println(map);
                if (map[mapLength - 1] == snakeStructure) {
                    System.out.println("CONGRATULATIONS YOU'VE WON");
                }
            } else if (direction.contentEquals("b")) {
                map[snakeEndIndex--] = mapStructure;
                map[snakeStartIndex--] = snakeStructure;
                if (map[startPoint] == snakeStructure) {
                    System.out.println("you've lost, start again.");
                    break;
                }
                System.out.println(map);
            } else {
                System.out.println("something went wrong");
            }
        }
    }
}


