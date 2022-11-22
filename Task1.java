public class Task1 {
    public static void main(String[] args) {

        Field gameField = Field.getFieldFromProperties();
        LogWriter.write("Task1: Created field, with default parameters");
        Snake playerSnake = Snake.getSnakeFromProperties();
        LogWriter.write("Task1: Created snake, with default parameters");
        long startTime = System.nanoTime();
        LogWriter.write("Task1: Started game");
        gameField.play(playerSnake);
        LogWriter.write("Task1: Finished gamed");
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        LogWriter.write("Task1: Calculated time of execution: " + totalTime);
        System.out.println(totalTime);
    }
}
