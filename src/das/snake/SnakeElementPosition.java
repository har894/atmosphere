package snake;

public class SnakeElementPosition {

    public   int snackElementPosition(char[] map) {
        int firstPoint = -1;

        for (int i = 0; i < map.length; i++) {
            if (map[i] == '*') {
                firstPoint = i;
                break;
            }
        }
        return firstPoint;
    }
}
