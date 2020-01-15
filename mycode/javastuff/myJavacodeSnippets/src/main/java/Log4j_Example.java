import org.apache.log4j.Logger;

import java.io.FileReader;
import java.io.IOException;


public class Log4j_Example {
    static Logger log = Logger.getLogger(Log4j_Example.class.getName());
    public static void main(String args[] ) {

        log.info(" Sample log Message");
        log.debug("Sample debug Message");
        log.warn("sample Warn Message");

        try {
            FileReader fileReader = new FileReader("/src/main/resources/input1.txt");

        }
        catch (IOException e){
            e.getStackTrace();
            log.fatal("Exeception Caught " +e);
            log.error("Error:  "+e.getMessage());
        }
    }
}
