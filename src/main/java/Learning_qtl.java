import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Learning_qtl {

    public void testMethodWithParams(String testParam) throws FileNotFoundException {

    }

    public static void main(String[] args) throws IOException {
        FileInputStream in =new FileInputStream("/Users/lilithharutyunyan/Desktop/workspace/atmosphere/test");
        Properties p = new Properties();
        p.load(in);
        String x = p.getProperty("startPoint");
        System.out.println(x);
    }
   }




