package src.das.snake;

import java.util.Arrays;

public class Map {

    public  char[] createMap(int mapLength, char itemSymbol) {
        char[] map = new char[mapLength];
        Arrays.fill(map, itemSymbol);
        return map;
    }
}
