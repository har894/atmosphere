import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class LogWriter {

    public static void write(String log) {

        try {
            LocalDateTime localDateTime = LocalDateTime.now();
            String concatenated = localDateTime + "---" + log + "\n";
            File logFile = new File("logs/Logs.txt");
            FileWriter fileWriter = new FileWriter(logFile, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(concatenated);
            bufferedWriter.close();
        } catch (IOException exception) {
            System.out.println("Could not write in file");
        }
    }
}
