import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Scanner;

public class Directory_Info {
    public static void main(String args[])  {
        //getting directory name from user
        System.out.println("Enter the directory name:" );
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        File file = new File(t);
try {


    for (File file1 : file.listFiles()) {
        Path path1 = Paths.get(String.valueOf(file1));
        BasicFileAttributes attributes1 = Files.getFileAttributeView(path1,
                BasicFileAttributeView.class).readAttributes();
        System.out.println("========================================================");
        System.out.println("File Name " + file1);
        double bytes = attributes1.size();
        System.out.println("File Size:   " + bytes);
        FileTime lastModified = attributes1.lastModifiedTime();
        System.out.println("File Last Modified:   " + lastModified);
        FileTime created = attributes1.creationTime();
        System.out.println("File Creation Date:   " + created);

    }
} catch (Exception e) {
    System.out.println("Incorrect Path");
    e.printStackTrace();
}
System.out.println("End");
    }
}
