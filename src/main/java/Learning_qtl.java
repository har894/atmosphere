import java.util.Scanner;

public class Learning_qtl {
    public static void main(String[] args) {

        String text = "Give direction [f or b]:_";
        String successText = "CONGRATULATIONS YOU'VE WON!";
        String failText="you've lost, start again.";
        String unknownErrorText = "something went wrong";
        String moveForward="f";
        String moveBack="b";

        char[] map;
        int startPoint;
        startPoint = 0;
        char mapStructure = '-';
        int mapLength=10;
        char snakeStructure= '*';
        int snakeLength= 1;

       //init map
        map = new char[mapLength];
        for (int i = 0; i < mapLength; i++) {
            map[i] = mapStructure;
        }

        //snake head and tail
        int snakeStartIndex = startPoint;
        int snakeEndIndex = snakeStartIndex + snakeLength;

        //place the snake on the map
        for (int i = startPoint; i < startPoint + snakeLength; i++) {
            map[i] = snakeStructure;
        }
        System.out.println(map);


        while (map[mapLength - 1] == mapStructure) {
            Scanner scan = new Scanner(System.in);
            String direction;
            do {
                System.out.println(text);
                direction = scan.next().toLowerCase();

            } while (!direction.contentEquals(moveForward) & !direction.contentEquals(moveBack));


            if (direction.contentEquals(moveForward)) {
                map[snakeStartIndex++] = mapStructure;
                map[snakeEndIndex++] = snakeStructure;
                System.out.println(map);
                if (map[mapLength - 1] == snakeStructure) {
                    System.out.println(successText);
                }
            } else if (direction.contentEquals(moveBack)) {
                map[snakeStartIndex--] = snakeStructure;
                map[snakeEndIndex--] = mapStructure;
                System.out.println(map);
                if (map[startPoint] == snakeStructure) {
                    System.out.println(failText);
                    break;
                }
            } else {
                System.out.println(unknownErrorText);
            }
        }
    }
}


