package snakeWithConfigFile.snakes;

import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;

public class SnakeElementPosition {

    public   int snackElementPosition(char[] map) {
        ReadFileIntoList readFileIntoList = new ReadFileIntoList();
        List<String> listOfConfigWithStringValue = readFileIntoList.readFileInList("/Users/arammkhitaryan/Desktop/snack/atmosphere/src/das/snakeWithConfigFile/snakes/configForStringValue.text");
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        for (int i = 0; i < listOfConfigWithStringValue.size(); i++) {
            stringStringHashMap.put((listOfConfigWithStringValue.get(i).substring(0, listOfConfigWithStringValue.get(i).indexOf(':'))), listOfConfigWithStringValue.get(i).substring(listOfConfigWithStringValue.get(i).lastIndexOf(":") + 1));
        }
        String snakeSymbol = stringStringHashMap.get("snakeSymbol");
        int firstPoint = -1;

        for (int i = 0; i < map.length; i++) {
            if (map[i] == snakeSymbol.charAt(0)) {
                firstPoint = i;
                break;
            }
        }
        return firstPoint;
    }
}
