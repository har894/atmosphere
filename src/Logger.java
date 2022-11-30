import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    public static void log(String text) throws IOException {
        String path = "src/Logs.txt";
        try{
            FileWriter fileWriter = new FileWriter(path);
            fileWriter.write(text);
            fileWriter.close();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
