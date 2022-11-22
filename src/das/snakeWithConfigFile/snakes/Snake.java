package snakeWithConfigFile.snakes;

import java.util.Arrays;

public class Snake {

    public  char[] crateSnake(int snakeLength, char snakeSymbol) {
        char[] snake = new char[snakeLength];
        Arrays.fill(snake, snakeSymbol);
        return snake;
    }
}
