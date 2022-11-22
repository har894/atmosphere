package src.das.snakeWithConfigFile.snake;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Map<C, I extends Number> {

    public  char[] createMap(int mapLength, char itemSymbol) {
        char[] map = new char[mapLength];
        Arrays.fill(map, itemSymbol);
        return map;
    }
}
