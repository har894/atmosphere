import java.util.Properties;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Field gameField = Field.getFieldFromProperties();
        LogWriter.write("Task2: Created field, with default parameters");
        Snake playerSnake = Snake.getSnakeFromProperties();
        LogWriter.write("Task2: Created snake, with default parameters");
        Scanner input = new Scanner(System.in);
        LogWriter.write("Task2: Started game");
        System.out.println("Type f to move forward, b to move backward");
        gameField.move(playerSnake, "s");
        while(input.hasNext()) {
            String moveDirection = input.nextLine();
            LogWriter.write("Task2: Ordered move - " + moveDirection);
            gameField.move(playerSnake, moveDirection);
            LogWriter.write("Task2: Made move - " + moveDirection);
        }
    }
}
