package snakeWithConfigFile.snakes;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Print {
    private static Logger LOGGER = Logger.getLogger("InfoLogging");
    public  void printMap(char[] map) {
        for (char element : map) {
            LOGGER.log( Level.FINE, "processing {0} entries in loop", map.length );
            System.out.print(element + " ");
        }
    }
}
