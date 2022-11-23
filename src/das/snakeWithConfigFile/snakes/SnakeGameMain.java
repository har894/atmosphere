package snakeWithConfigFile.snakes;


import java.io.IOException;
import java.util.*;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class SnakeGameMain {

    private static final Logger LOGGER = Logger.getLogger("InfoLogging");

    public static void main(String[] args) throws IOException {
        FileHandler fh;
        fh = new FileHandler("/Users/arammkhitaryan/Desktop/snack/atmosphere/src/das/snakeWithConfigFile/snakes/logger.text");
        LOGGER.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);
        LOGGER.info("Game is started");
        // the following statement is used to log any messages

        ReadFileIntoList readFileIntoList = new ReadFileIntoList();
        List<String> listOfConfigWithIntegerValue = readFileIntoList.readFileInList("/Users/arammkhitaryan/Desktop/snack/atmosphere/src/das/snakeWithConfigFile/snakes/configForIntegerValue.text");

        List<String> listOfConfigWithStringValue = readFileIntoList.readFileInList("/Users/arammkhitaryan/Desktop/snack/atmosphere/src/das/snakeWithConfigFile/snakes/configForStringValue.text");

        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        for (int i = 0; i < listOfConfigWithIntegerValue.size(); i++) {
            LOGGER.log( Level.FINE, "processing {0} entries in loop", listOfConfigWithIntegerValue.size() );
            stringIntegerHashMap.put((listOfConfigWithIntegerValue.get(i).substring(0, listOfConfigWithIntegerValue.get(i).indexOf(':'))), Integer.valueOf(listOfConfigWithIntegerValue.get(i).substring(listOfConfigWithIntegerValue.get(i).lastIndexOf(":") + 1)));
        }

        for (int i = 0; i < listOfConfigWithStringValue.size(); i++) {
            LOGGER.log( Level.FINE, "processing {0} entries in loop", listOfConfigWithStringValue.size() );
            stringStringHashMap.put((listOfConfigWithStringValue.get(i).substring(0, listOfConfigWithStringValue.get(i).indexOf(':'))), listOfConfigWithStringValue.get(i).substring(listOfConfigWithStringValue.get(i).lastIndexOf(":") + 1));
        }
        Integer lengthOfMap = stringIntegerHashMap.get("lengthOfMap");
        Integer lengthOfSnake = stringIntegerHashMap.get("lengthOfSnake");
        Integer index = stringIntegerHashMap.get("index");
        String itemSymbol = stringStringHashMap.get("itemSymbol");
        String snakeSymbol = stringStringHashMap.get("snakeSymbol");


        Scanner scanner = new Scanner(System.in);

        Map map = new Map();
        char[] gameMap = map.createMap(lengthOfMap, itemSymbol.charAt(0));

        Snake snake = new Snake();
        char[] gameSnakes = snake.crateSnake(lengthOfSnake, snakeSymbol.charAt(0));
        int mapLength = gameMap.length;

        CreateNewMap createNewMap = new CreateNewMap();

        char[] newMap = createNewMap.createNewMap(gameMap, mapLength, gameSnakes, index);
        Print print = new Print();

        print.printMap(gameMap);
        System.out.println("\n");
        print.printMap(gameSnakes);
        System.out.println("\n");
        print.printMap(newMap);
        System.out.println("\n");

        boolean value =true;

        while (value) {
            MoveSnake moveSnake = new MoveSnake();
            System.err.println("Please enter the f or d: ");
            String direction = scanner.next();
            moveSnake.moveSnackOnMap(newMap, direction, lengthOfSnake);

            print.printMap(newMap);
            System.out.println("\n");

        }

    }
}




