package snake;

public class MoveSnake {

    public void moveSnackForward(char[] map, int snackLength) {
        SnakeElementPosition snakeElementPosition = new SnakeElementPosition();
        int snackPosition = snakeElementPosition.snackElementPosition(map);
        char currentPosition = map[snackPosition];
        map[snackPosition] = map[snackPosition + snackLength];
        map[snackPosition + snackLength] = currentPosition;

    }

    public void moveSnackBack(char[] map, int snackLength) {
        SnakeElementPosition snakeElementPosition = new SnakeElementPosition();
        int snackPosition = snakeElementPosition.snackElementPosition(map);
        char currentPosition = map[snackPosition - 1];
        map[snackPosition - 1] = map[snackPosition + snackLength - 1];
        map[snackPosition + snackLength - 1] = currentPosition;
    }


    public void moveSnackOnMap(char[] map, String direction, int snackLength) {
        if (direction.equals("f")) {
            moveSnackForward(map, snackLength);
        } else if (direction.equals("b")) {
            moveSnackBack(map, snackLength);
        }
    }
}
