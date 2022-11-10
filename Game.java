public class Game {
    public static void main(String[] args) {

        Field gameField = new Field(12, '-');
        Snake playerSnake = new Snake(4, '*');
        gameField.play(playerSnake);
    }
}
