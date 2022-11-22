import java.util.Properties;

public class Snake {

    public String getSnake() {
        return snake;
    }

    private final String snake;

    public Snake(int length, String snakeDesign) {
        snake = String.format("%0" + length + "d", 0).replace("0", snakeDesign);
    }

    public static Snake getSnakeFromProperties() {
        Properties properties = ConfigReader.readProperty("resources/game.cfg");
        int snakeLength = Integer.parseInt(properties.getProperty("snakeLength"));
        String snakeDesign = properties.getProperty("snakeDesign");
        return new Snake(snakeLength, snakeDesign);
    }
}
