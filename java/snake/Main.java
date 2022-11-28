import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        LogSystem.log("INFO: Read processes configFile.text");

        ReadConfigFile readConfigFile = new ReadConfigFile();
        List<String> listOfConfigValue = readConfigFile.readFile("/Users/sevakivanyan/workspace/atmosphere/java/snake/configFile.text");

        HashMap<String, Object> objectsHashMap = new HashMap<>();
        for (int i = 0; i < listOfConfigValue.size(); i++) {
            objectsHashMap.put((listOfConfigValue.get(i).substring(0, listOfConfigValue.get(i).indexOf('='))), (listOfConfigValue.get(i).substring(listOfConfigValue.get(i).lastIndexOf("=") + 1)));
        }
        int gameScreen = Integer.parseInt((String) (objectsHashMap.get("mapLength")));

        LogSystem.log("INFO: Game started");
        final int SCREEN_WIDTH = gameScreen;
        final int SNAKE_STARTING_X = SCREEN_WIDTH / 2;

        LogSystem.log("INFO: Add game screen");
        GameScreen screen = new GameScreen(SCREEN_WIDTH);
        screen.InitScreen();

        LogSystem.log("INFO: Snake element one");
        Snake snake = new Snake('*', SNAKE_STARTING_X);
        screen.setObjectOnLocation(snake, snake.getX());

        LogSystem.log("INFO: Snake element two");
        Snake snake1 = new Snake('*', SNAKE_STARTING_X + 1);
        screen.setObjectOnLocation(snake1, snake1.getX());

        LogSystem.log("INFO: Snake element three");
        Snake snake2 = new Snake('*', SNAKE_STARTING_X + 2);
        screen.setObjectOnLocation(snake2, snake2.getX());

        Scanner scanner = new Scanner(System.in);
        char input;
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("game started please press 'l' for going to the left or press 'r' for going to the right : ");
            screen.PrintScreen();
            switch (input = scanner.nextLine().charAt(0)) {
                case 'l':
                    LogSystem.log("INFO: Snake move left");
                    snake.moveLeft(screen, snake);
                    snake1.moveLeft(screen, snake1);
                    snake2.moveLeft(screen, snake2);
                    break;
                case 'r':
                    LogSystem.log("INFO: Snake move right");
                    snake2.moveRight(screen, snake2);
                    snake1.moveRight(screen, snake1);
                    snake.moveRight(screen, snake);
                    break;
            }
        }
    }
}
