import java.io.IOException;
import java.util.logging.Logger;

public class Run {

    public static void main(String[] args) throws IOException {

        ConfigHelper configHelper = new ConfigHelper();
        int startPoint = Integer.parseInt(configHelper.getStringValueByGivingKey("startPoint", configHelper.DOC_SOURCE));
        int snakeLength = Integer.parseInt(configHelper.getStringValueByGivingKey("snakeLength", configHelper.DOC_SOURCE));
        String snakeStructure = configHelper.getStringValueByGivingKey("snakeStructure", configHelper.DOC_SOURCE);
        int mapLength = Integer.parseInt(configHelper.getStringValueByGivingKey("mapLength", configHelper.DOC_SOURCE));
        String mapStructure = configHelper.getStringValueByGivingKey("mapStructure", configHelper.DOC_SOURCE);


        NewSnake snakeO = new NewSnake(startPoint, snakeLength, snakeStructure, mapLength, mapStructure);
        snakeO.start();
    }
}
