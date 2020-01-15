package CodingToAnInterfaceExample.ourInterface;

import java.io.File;
import CodingToAnInterfaceExample.Implementation.JSONFileProcessor;
import CodingToAnInterfaceExample.Implementation.XMLFileProcessor;

public class FileProcessObjectSelectorImpl implements FileProcessObjectSelector
{
    public FileProcessor SelectObjectBasedOnFilename(File file_name)
    {
        if (file_name.getName().endsWith(".xml")) {
            System.out.println("***********************************");
            System.out.println("Processing " +file_name.getName());
            System.out.println("***********************************");
            return new XMLFileProcessor();
        }
        else if (file_name.getName().endsWith(".json")) {
            System.out.println("***********************************");
            System.out.println("Processing " +file_name.getName());
            System.out.println("***********************************");
            return new JSONFileProcessor();
        }
        else {
            System.out.println ("IGNORING FILE AS it is neither XML nor JSON"+file_name.getName());
            return null;
        }
    }
}
