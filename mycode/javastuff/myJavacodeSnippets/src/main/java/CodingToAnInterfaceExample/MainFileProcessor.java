package CodingToAnInterfaceExample;

import CodingToAnInterfaceExample.ourInterface.FileProcessObjectSelector;
import CodingToAnInterfaceExample.Implementation.FileProcessObjectSelectorImpl;
import CodingToAnInterfaceExample.ourInterface.FileProcessor;

import java.io.File;
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
