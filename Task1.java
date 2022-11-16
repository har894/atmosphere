public class Task1 {
    public static void main(String[] args) {

        Field gameField = new Field(10, '-');
        Snake playerSnake = new Snake(3, '*');
        long startTime = System.nanoTime();
        gameField.play(playerSnake);
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }
}
