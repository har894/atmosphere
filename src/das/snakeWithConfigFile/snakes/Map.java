package snakeWithConfigFile.snakes;

import java.util.Arrays;

public class Map<C, I extends Number> {

    public  char[] createMap(int mapLength, char itemSymbol) {
        char[] map = new char[mapLength];
        Arrays.fill(map, itemSymbol);
        return map;
    }
}
