import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;


public class MyLogger {
    public static void log(String text) {
        String path = "src/Logs.txt";
        LocalDateTime time = LocalDateTime.now();
        try{
            FileWriter fileWriter = new FileWriter(path,true);
            fileWriter.write("INFO : " + time + " - " + text);
            fileWriter.append("\n");
            fileWriter.close();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
