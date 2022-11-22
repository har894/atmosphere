import java.util.Properties;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Field gameField = Field.getFieldFromProperties();
        Snake playerSnake = Snake.getSnakeFromProperties();
        Scanner input = new Scanner(System.in);
        gameField.move(playerSnake, "s");
        while(input.hasNext()) {
            String moveDirection = input.nextLine();
            gameField.move(playerSnake, moveDirection);
        }
    }
}
