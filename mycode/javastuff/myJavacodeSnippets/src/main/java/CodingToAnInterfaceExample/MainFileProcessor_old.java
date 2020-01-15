package CodingToAnInterfaceExample;

import CodingToAnInterfaceExample.Implementation.JSONFileProcessor;
import CodingToAnInterfaceExample.Implementation.XMLFileProcessor;
import CodingToAnInterfaceExample.ourInterface.FileProcessor;

import java.io.File;
import java.util.Scanner;

public class MainFileProcessor_old
{
    public static void main(String[] args) throws Exception
    {
        // Read a directory name from user
        Scanner sc = new Scanner(System.in);
        String directoryName = sc.nextLine();

        // Directory object
        File directory = new File(directoryName);

        // Our File Processor object
        FileProcessor fp = null;

        //Iterating through each files
        for (File file_name : directory.listFiles())
        {
            // create object of required type BASED on
            // the file extension whether XML OR JSON
            if (file_name.getName().endsWith(".xml")) {
                System.out.println("***********************************");
                System.out.println("Processing " +file_name.getName());
                System.out.println("***********************************");
                fp = new XMLFileProcessor();
            }
            else if (file_name.getName().endsWith(".json")) {
                System.out.println("***********************************");
                System.out.println("Processing " +file_name.getName());
                System.out.println("***********************************");
                fp = new JSONFileProcessor();
            }
            else {
                System.out.println ("IGNORING FILE AS it is neither XML nor JSON"+file_name.getName());
                continue;
            }

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
    }
}
