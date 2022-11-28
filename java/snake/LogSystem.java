import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogSystem {
    public static void log(String text) {

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDateTime = now.format(format);

        try {
            FileWriter fWriter = new FileWriter("/Users/sevakivanyan/workspace/atmosphere/java/snake/infoLogFile.txt",true);
            fWriter.write(formatDateTime + " " + text);
            fWriter.append("\n");
            fWriter.close();
            System.out.println(formatDateTime + " " + text + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
//        try {
//            FileReader fReader = new FileReader("/Users/sevakivanyan/workspace/atmosphere/java/snake/infoLogFile.txt");
//            int line;
//            while ((line = fReader.read()) != -1) {
//                System.out.print((char) line);
//            }
//
//        } catch (IOException e) {
//            throw new RuntimeException(e.getMessage());
//        }
    }
}
