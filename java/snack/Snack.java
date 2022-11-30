import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import java.util.Scanner;

public class Snack {

    private static Logger logger = LogManager.getLogger(Snack.class.getName());

    private static char[] createEmptyMap(int mapLength) {
        char[] map = new char[mapLength];

        for (int i = 0; i < mapLength; i++) {
            map[i] = '-';
        }
        return map;
    }

    private static void printMap(char[] emptyMap) {

        for (int i = 0; i < emptyMap.length; i++) {
            System.out.print(emptyMap[i] + " ");
        }
    }

    private static char[] createSnack(int length) {

        char[] snack = new char[length];
        for (int i = 0; i < length; i++) {
            snack[i] = '*';
        }
        return snack;
    }

    private static char[] insertSnackInMap(char[] map, char[] snack, int position) {
        if (snack.length + position > map.length) System.out.println("Please pay attention to map borders");

        for (int i = 0; i < snack.length; i++) {
            map[position] = snack[i];
            position++;
        }
        return map;
    }

    private static int findFirstSnackPosition(char[] map) {
        int firstPoint = -1;

        for (int i = 0; i < map.length; i++) {
            if (map[i] == '*') {
                firstPoint = i;
                break;
            }
        }
        return firstPoint;
    }

    private static void moveSnackOneStepToForward(char[] map, int snackLength) {
        int firstSnackPosition = findFirstSnackPosition(map);
        if (firstSnackPosition + snackLength >= map.length)
            throw new RuntimeException("Snack can not move forward as it will go out of bounds");

        char currentPosition = map[firstSnackPosition];
        map[firstSnackPosition] = map[firstSnackPosition + snackLength];
        map[firstSnackPosition + snackLength] = currentPosition;
    }

    private static void moveSnackOneStepToBackward(char[] map, int snackLength) {
        int firstSnackPosition = findFirstSnackPosition(map);
        if (firstSnackPosition == 0)
            throw new RuntimeException("Snack can not move backward as it will go out of bounds");

        char currentPosition = map[firstSnackPosition - 1];
        map[firstSnackPosition - 1] = map[firstSnackPosition + snackLength - 1];
        map[firstSnackPosition + snackLength - 1] = currentPosition;
    }

    private static void moveSnackOnMap(char[] map, String direction, int snackLength) {
        if (direction.equals("f")) {
            moveSnackOneStepToForward(map, snackLength);
            logger.info("'f' is selected");
        } else if (direction.equals("b")) {
            moveSnackOneStepToBackward(map, snackLength);
            logger.info("'b' is selected");
        } else {
            logger.info("None of f and g has been selected");
            return;
        }
    }


    public static void main(String[] args) {

        //BasicConfigurator.configure();
        DOMConfigurator.configure("log4j.xml");

        int mapSize = 10;
        int snackSize = 3;

        char[] emptyMap = createEmptyMap(mapSize);
        printMap(emptyMap);
        System.out.println();
        char[] snack = createSnack(snackSize);
        char[] snackInMap = insertSnackInMap(emptyMap, snack, 7);
        printMap(snackInMap);
        System.out.println();
        while (true) {
            System.out.println();
            System.out.println("Please input 'b' or 'f'");
            System.out.println();
            Scanner scanner = new Scanner(System.in);
            String direction = scanner.next();
            moveSnackOnMap(snackInMap, direction, snackSize);
            printMap(snackInMap);
        }
    }
}
