import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Snack {

    private static char[] createEmptyMap(int mapLength, String symbolOfMap) {
        char[] map = new char[mapLength];

        for (int i = 0; i < mapLength; i++) {
            map[i] = symbolOfMap.charAt(0);
        }
        return map;
    }

    private static void printMap(char[] emptyMap) {

        for (int i = 0; i < emptyMap.length; i++) {
            System.out.print(emptyMap[i] + " ");
        }
    }

    private static char[] createSnack(int length, String symbolOfSnack) {

        char[] snack = new char[length];
        for (int i = 0; i < length; i++) {
            snack[i] = symbolOfSnack.charAt(0);
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
        } else if (direction.equals("b")) {
            moveSnackOneStepToBackward(map, snackLength);
        } else {
            return;
        }
    }

    public static List<String> readFileInList(String fileName) {
        List<String> lines = Collections.emptyList();
        try {
            lines =
                    Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }


    public static void main(String[] args) {


        Map<String, Object> allInformationOfConfigFile = new HashMap<>();

        List<String> list = readFileInList("/Users/vazgenlevonyan/Desktop/vord/atmosphere/java/snack/config.txt");

        for (int i = 0; i < list.size(); i++) {
            allInformationOfConfigFile.put((list.get(i).substring(0, list.get(i).indexOf('='))), (list.get(i).substring(list.get(i).lastIndexOf("=") + 1)));
        }

        Integer mapSize = Integer.valueOf((String) (allInformationOfConfigFile.get("mapSize")));
        Integer snackSize = Integer.valueOf((String) (allInformationOfConfigFile.get("snackSize")));
        String symbolOfMap = (String) allInformationOfConfigFile.get("symbolOfMap");
        String symbolOfSnack = (String) allInformationOfConfigFile.get("symbolOfSnack");
        char[] emptyMap = createEmptyMap(mapSize, symbolOfMap);
        printMap(emptyMap);
        System.out.println();
        char[] snack = createSnack(snackSize, symbolOfSnack);
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
