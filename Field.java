import java.util.Properties;

public class Field {

    private final String field;

    private int snakeHeadPosition = 0;

    public Field(int length, String fieldDesign) {
        field = String.format("%0" + length + "d", 0).replace("0", fieldDesign);
    }

    public static Field getFieldFromProperties() {
        Properties properties = ConfigReader.readProperty("resources/game.cfg");
        int fieldLength = Integer.parseInt(properties.getProperty("fieldLength"));
        String fieldDesign = properties.getProperty("fieldDesign");
        return new Field(fieldLength, fieldDesign);
    }

    public void play(Snake snake) {

        int snakeLength = snake.getSnake().length();
        for (int i = 0; i <= field.length() - snakeLength; ++i) {
            StringBuilder currentFieldBuilder = new StringBuilder(field);
            currentFieldBuilder.replace(i, i + snakeLength, snake.getSnake());
            System.out.println(currentFieldBuilder);
        }
        System.out.println("Finish");
    }

    private void replace(Snake snake) {

        StringBuilder currentFieldBuilder = new StringBuilder(field);
        int snakeLength = snake.getSnake().length();
        if (snakeHeadPosition < snakeLength - 1) {
            int firstInTheFieldPointIndex = snakeLength - snakeHeadPosition - 1;
            currentFieldBuilder.replace(0, snakeHeadPosition + 1,
                    snake.getSnake().substring(firstInTheFieldPointIndex));
        } else if (snakeHeadPosition > field.length() - 1) {
            int inTheFieldPresentPoints = snakeLength - (snakeHeadPosition - field.length() + 1);
            currentFieldBuilder.replace(field.length() - inTheFieldPresentPoints, field.length(),
                    snake.getSnake().substring(0, inTheFieldPresentPoints));
        } else {
            int tailPosition = snakeHeadPosition - snakeLength + 1;
            currentFieldBuilder.replace(tailPosition, snakeHeadPosition + 1, snake.getSnake());
        }

        System.out.println(currentFieldBuilder);
    }

    public void move(Snake snake, String direction) {

        int snakeLength = snake.getSnake().length();
        switch (direction) {
            case "f":
                if (snakeHeadPosition == field.length() + snakeLength - 2) {
                    LogWriter.write("Field.move(): The snake will be out of the field!!!");
                    System.out.println("The snake will be out of the field!!!");
                } else {
                    ++snakeHeadPosition;
                }
                break;
            case "b":
                if (snakeHeadPosition == 0) {
                    LogWriter.write("Field.move(): The snake will be out of the field!!!");
                    System.out.println("The snake will be out of the field!!!");
                } else {
                    --snakeHeadPosition;
                }
                break;
            default:
                break;
        }
        replace(snake);
        LogWriter.write("Field.move(): Replaced snake's position");
    }
}
