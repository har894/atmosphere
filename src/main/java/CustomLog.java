import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class CustomLog {


    public static void log(String text) {
        String path="/Users/lilithharutyunyan/Desktop/workspace/atmosphere/test_file.txt";
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path);
            fileWriter.write(text);
            fileWriter.append(text);
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
