public class Field {

    private final String field;

    public Field(int length, char fieldDesign) {
        field = String.format("%0" + length + "d", 0).replace('0', fieldDesign);
    }

    public void play(Snake snake) {

        int snakeLength = snake.getSnake().length();
        for (int i = 0; i <= field.length() - snakeLength; ++i) {
            StringBuilder currentFiledBuilder = new StringBuilder(field);
            currentFiledBuilder.replace(i, i+snakeLength, snake.getSnake());
            System.out.println(currentFiledBuilder);
        }
        System.out.println("Finish");
    }
}
