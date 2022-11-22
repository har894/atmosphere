import java.util.Properties;

public class Task1 {
    public static void main(String[] args) {

        Field gameField = Field.getFieldFromProperties();
        Snake playerSnake = Snake.getSnakeFromProperties();
        long startTime = System.nanoTime();
        gameField.play(playerSnake);
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }
}
