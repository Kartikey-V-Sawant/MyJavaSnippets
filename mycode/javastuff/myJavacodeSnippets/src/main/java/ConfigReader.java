import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    public static void main(String args[]) throws Exception{
        //create object of Properties class
        Properties prop=new Properties();
        // Create object of FileInputStream and give property file location as fileInputStream parameter
        FileInputStream fileread=new FileInputStream("src/main/resources/config.properties");
        //load the property file
        prop.load(fileread);
        //read the properties of config file using getProperty
        System.out.println(prop.getProperty("user"));
        System.out.println(prop.getProperty("company1"));
        System.out.println(prop.getProperty("url"));

    }
}
