package snakeWithConfigFile.snakes;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class ReadFileIntoList {
    private static Logger LOGGER = Logger.getLogger("InfoLogging");
    public  List<String> readFileInList(String fileName) {

        List<String> lines = Collections.emptyList();
        try {
            lines =
                    Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        } catch (IOException e) {
            LOGGER.warning("This is a WARN log level message: The path of the file is incorrect. ");
            e.printStackTrace();
        }
        return lines;
    }

}
