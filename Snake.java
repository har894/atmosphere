public class Snake {

    public String getSnake() {
        return snake;
    }

    private final String snake;

    public Snake(int length, char snakeDesign) {
        snake = String.format("%0" + length + "d", 0).replace('0', snakeDesign);
    }
}
