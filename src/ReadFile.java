import java.io.File;
import java.util.Scanner;

public class ReadFile {
    public static String readConfigs(int j) {
        String configPath = "src/config.txt";
        File text = new File(configPath);
        int i = 0;
        String[] config = new String[3];
        try {
            Scanner scanner = new Scanner(text);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] arrOfLine = line.split("=:");
                config[i] = arrOfLine[1];
                i++;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return config[j];
    }
}
