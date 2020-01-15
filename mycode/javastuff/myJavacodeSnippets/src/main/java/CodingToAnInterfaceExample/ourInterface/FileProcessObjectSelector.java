package CodingToAnInterfaceExample.ourInterface;

import CodingToAnInterfaceExample.Implementation.XMLFileProcessor;

import java.io.File;

public interface FileProcessObjectSelector {

    FileProcessor SelectObjectBasedOnFilename (File filename);

}
