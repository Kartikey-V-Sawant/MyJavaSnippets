
import java.io.File;
import java.io.FileReader;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.io.FileInputStream;
import java.util.Set;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Json_File_Validity {
    public static void main(String args[]) {
        JSONParser parser = new JSONParser();
        Properties prop=new Properties();
        try {
            //Reading the Active Config
            FileReader fileInput = new FileReader("/home/kartikey.sawant/mycode/javastuff/myJavacodeSnippets/src/main/resources/ActiveConfig.properties");
            prop.load(fileInput);

            Set<String> configFile = prop.stringPropertyNames();
            for (String entry:configFile) {
                //if (list.isFile()) {
                    // if file is a regular-file AND NOT a directory
                    FileReader fileInputStream = new FileReader((prop.getProperty(entry)));
                    prop.load(fileInputStream);
                    System.out.println("====Checking Validity With Config:" +prop.getProperty(entry)+" =======");
                    System.out.println(" ");

                    File file = new File(prop.getProperty("path"));
                    try {
                        parser.parse(new FileReader(file));
                        System.out.println("VALID JSON FILE: " + file.getName());
                        System.out.println(" ");
                    } catch (ParseException e) {
                        System.out.println("JSON PARSE EXCEPTION: file (" + file.getName() + ") : ERROR_TPYE: (" + e.getErrorType() + ") : STRING (" + e.toString() + ")");
                        System.out.println(" ");
                        //e.printStackTrace();
                    }
                }

            //}
        } catch (Exception e) {
            System.out.println("EXCEPTION: " + e.getMessage())  ;
            e.printStackTrace();
        }


    }
}

