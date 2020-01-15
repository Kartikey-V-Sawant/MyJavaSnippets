package CodingToAnInterfaceExample;

import CodingToAnInterfaceExample.Implementation.JSONFileProcessor;
import CodingToAnInterfaceExample.Implementation.XMLFileProcessor;
import CodingToAnInterfaceExample.ourInterface.FileProcessObjectSelector;
import CodingToAnInterfaceExample.ourInterface.FileProcessObjectSelectorImpl;
import CodingToAnInterfaceExample.ourInterface.FileProcessor;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.StringWriter;
import java.util.Scanner;

public class MainFileProcessor
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("Enter the directory ");
        // Read a directory name from user
        Scanner sc = new Scanner(System.in);
        String directoryName = sc.nextLine();

        // Directory object
        File directory = new File(directoryName);

        // Our File Processor object
        FileProcessor fp = null;
        FileProcessObjectSelector selector = new FileProcessObjectSelectorImpl();

        //Iterating through each file
        for (File file_name : directory.listFiles())
        {
            fp = selector.SelectObjectBasedOnFilename (file_name) ;
            if (fp != null) {
                // process the given file
                try {
                    fp.setFileName(String.valueOf(file_name));
                    fp.processing_logic();
                }
                catch (Exception e) {
                    System.out.println ("EXCEPTION IN MAIN: [" + e.getMessage() + "]") ;
                    e.printStackTrace();
                }
            }
            else
                System.out.println ("fp was null!");
        }
    }
}
