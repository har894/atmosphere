import java.util.Scanner;

public class Learning_qtl {
    public static void main(String[] args) {

        String moveForward = "f";
        String moveBack = "b";
        String taskText = "Give direction [" + moveForward + " or " + moveBack + "]:_";
        String successText = "CONGRATULATIONS YOU'VE WON!";
        String failText = "you've lost, start again.";


        char[] map;
        int startPoint = 5;
        char mapStructure = '-';
        int mapLength = 30;
        char snakeStructure = '*';
        int snakeLength = 3;

        //init map
        map = new char[mapLength];
        for (int i = 0; i < mapLength; i++) {
            map[i] = mapStructure;
        }

        //snake head and tail
        int snakeStartIndex = startPoint;
        int snakeEndIndex = snakeStartIndex + snakeLength;

        //init snake
        for (int i = startPoint; i < startPoint + snakeLength; i++) {
            map[i] = snakeStructure;
        }
        System.out.println(map);


        while (map[mapLength - 1] == mapStructure) {
            Scanner scan = new Scanner(System.in);
            String direction;

            do {
                System.out.println(taskText);
                direction = scan.next().toLowerCase();
            } while (!direction.contentEquals(moveForward) & !direction.contentEquals(moveBack));


            //FORWARD
            if (direction.contentEquals(moveForward)) {
                if (map[snakeEndIndex--] != map[snakeEndIndex++]) {
                    map[snakeStartIndex++] = mapStructure;
                    map[snakeEndIndex++] = snakeStructure;
                    System.out.println(map);
                } else {
                    map[snakeStartIndex++] = mapStructure;
                    map[snakeEndIndex++] = snakeStructure;
                    map[snakeStartIndex++] = mapStructure;
                    map[snakeEndIndex++] = snakeStructure;
                    System.out.println(map);
                }
            }
            //success msg block
            if (map[mapLength - 1] == snakeStructure) {
                System.out.println(successText);
            }

            //BACK
            else if (direction.contentEquals(moveBack)) {
                if (map[startPoint] == snakeStructure) {
                    System.out.println(failText);
                    break;
                }

                //verify if values are equal
                if (map[snakeStartIndex++] == map[snakeStartIndex--]) {
                    map[snakeStartIndex--] = snakeStructure;
                    map[snakeEndIndex--] = mapStructure;
                }
                map[snakeStartIndex--] = snakeStructure;
                map[snakeEndIndex--] = mapStructure;
                System.out.println(map);

                //fail msg block
                if (map[startPoint] == snakeStructure) {
                    System.out.println(failText);
                    break;
                }
            }
        }

    }

}




