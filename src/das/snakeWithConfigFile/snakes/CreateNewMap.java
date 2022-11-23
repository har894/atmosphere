package snakeWithConfigFile.snakes;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateNewMap {
    private static Logger LOGGER = Logger.getLogger("InfoLogging");

    public char[] createNewMap(char[] map, int mapLength ,char[] gameSnakes,int index){
        char[] newMap = new char[mapLength];
        int count=0;
        for (char element: map) {
            LOGGER.log( Level.FINE, "processing {0} entries in loop", map.length );
            newMap[count] =element;
            count++;
        }
        for (char element: gameSnakes) {
            LOGGER.log( Level.FINE, "processing {0} entries in loop", gameSnakes.length );
            newMap[index] =element;
            index++;
        }
        return newMap;
    }
}
