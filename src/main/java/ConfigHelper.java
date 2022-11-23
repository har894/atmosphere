import javax.management.StringValueExp;
import javax.xml.transform.stream.StreamResult;
import java.awt.*;
import java.io.*;
import java.util.Properties;
import java.util.Scanner;

public class ConfigHelper {

    String DOC_SOURCE = "/Users/lilithharutyunyan/Desktop/workspace/atmosphere/gameProps";

    public void setValuesViaScanner(String key) throws IOException {
        String temporaryValue;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set new value for " + key + " :_");
        temporaryValue = scanner.next();
        Properties prop = new Properties();
        FileOutputStream out = new FileOutputStream("test", true);
        prop.setProperty(key, temporaryValue);
        prop.store(out, null);
        out.close();
    }


    public String getStringValueByGivingKey(String key, String docName) throws IOException {
        String value;
        FileInputStream in = new FileInputStream(docName);
        Properties prop = new Properties();
        prop.load(in);
        return value = prop.getProperty(key);

    }


    public void openFile(String path) throws IOException {
        File gameSettingsFile = new File(path);
        Desktop desktop = Desktop.getDesktop();
        desktop.open(gameSettingsFile);
    }
}
