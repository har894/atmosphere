import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Field gameField = new Field(11, '-');
        Snake playerSnake = new Snake(4, '*');
        Scanner input = new Scanner(System.in);
        gameField.move(playerSnake, "s");
        while(input.hasNext()) {
            String moveDirection = input.nextLine();
            gameField.move(playerSnake, moveDirection);
        }
    }
}
