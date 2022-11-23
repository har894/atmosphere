import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class ReadConfigFile {
    private static Logger log = Logger.getLogger("log");
    public List<String> readFile(String fileName) throws IOException {
        log.info("Loge processes started in :ReadConfigFile.java file");
        FileHandler logFile;
        logFile = new FileHandler("./infoLogFile.txt");
        log.addHandler(logFile);

        List<String> lines = Collections.emptyList();
        try {
            lines =
                    Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        } catch (IOException e) {
            log.info("No such file or directory");
            e.printStackTrace();
        }
        return lines;
    }
}
