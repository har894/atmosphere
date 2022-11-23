import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class NewSnake {
    //DEFAULT
    String [] map;
    String direction;
    String moveForward = "f";
    String moveBack = "b";
    String taskText = "Give direction [" + moveForward + " or " + moveBack + "]:_";
    String successText = "CONGRATULATIONS YOU'VE WON!";
    String failText = "you've lost, start again.";
    int startPoint;
    String mapStructure;
    int mapLength;
    String snakeStructure;
    int snakeLength;



    NewSnake(int startPoint, int snakeLength, String snakeStructure, int mapLength, String mapStructure) {
        this.startPoint = startPoint;
        this.snakeLength = snakeLength;
        this.snakeStructure = snakeStructure;
        this.mapLength = mapLength;
        this.mapStructure = mapStructure;
    }


    //initialize snake
    public void initSnake() {
        initMap(mapLength, mapStructure);
        String[] map = this.map;
        for (int i = startPoint; i < startPoint + snakeLength; i++) {
            map[i] = snakeStructure;
        }
        System.out.println(Arrays.toString(map));
        System.out.println("map is initialized");
    }

    //initialize map
    private void initMap(int mapLength, String mapStructure) {
        map = new String[mapLength];
        for (int i = 0; i < mapLength; i++) {
            map[i] = mapStructure;
        }
    }

    public void askForDirection() {
        initSnake();
        int snakeStartIndex = startPoint;
        int snakeEndIndex = snakeStartIndex + snakeLength;
        try {
            while (map[mapLength - 1] == mapStructure) {
                Scanner scan = new Scanner(System.in);
                do {
                    System.out.println(taskText);
                    direction = scan.next().toLowerCase();
                } while (!direction.contentEquals(moveForward) & !direction.contentEquals(moveBack));

                if (direction.contentEquals(moveForward)) {
                    if (map[snakeEndIndex--] != map[snakeEndIndex++]) {
                        map[snakeStartIndex++] = mapStructure;
                        map[snakeEndIndex++] = snakeStructure;
                        System.out.println(Arrays.toString(map));
                        System.out.println("moved one step forward");
                        CustomLog.log("moved one step forward text from log method");
                    } else {
                        map[snakeStartIndex++] = mapStructure;
                        map[snakeEndIndex++] = snakeStructure;
                        map[snakeStartIndex++] = mapStructure;
                        map[snakeEndIndex++] = snakeStructure;
                        System.out.println(Arrays.toString(map));
                        System.out.println("moved one step forward");

                    }
                }
                if (map[mapLength - 1] == snakeStructure) {
                    System.out.println(successText);
                }
                //BACK
                else if (direction.contentEquals(moveBack)) {
                    if (map[snakeStartIndex++] == map[snakeStartIndex--]) {
                        map[snakeStartIndex--] = snakeStructure;
                        map[snakeEndIndex--] = mapStructure;
                    }
                    map[snakeStartIndex--] = snakeStructure;
                    map[snakeEndIndex--] = mapStructure;
                    System.out.println(Arrays.toString(map));
                    System.out.println("moved one step back");
                    CustomLog.log("Moved one step back");
                }

            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(failText);
            System.out.println("user moved out of the map");

        }

    }


    public int convertStringToInt(String stringValue) {
        int intValue;
        return Integer.parseInt(stringValue);
    }

    public void start() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String answer;
        String ownConfig = "yes";
        String defaultConfig = "no";
        do {
            System.out.println("Do you want to setup the game? " + ownConfig + "/" + defaultConfig + ":_");
            answer = scanner.next().toLowerCase();
        } while (!answer.contentEquals(ownConfig) & !answer.contentEquals(defaultConfig));
        if (answer.contentEquals(ownConfig)) {
            System.out.println("user selected yes option to change settings");
            ConfigHelper configHelper=new ConfigHelper();
            configHelper.openFile(configHelper.DOC_SOURCE);
            System.out.println("Save the changes and re-run the game");
        } else {
            System.out.println("Game with pre-defined settings has started");
            askForDirection();
        }
    }
}









