package InputFileReader;

import java.io.*;

public class inputFileReader {
    public static void main(String[] args) throws Exception {
        File file = new File("src/main/resources/input.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st ;
        System.out.println("writeable: "+file.canWrite());
        System.out.println("readable: "+file.canRead());
        System.out.println("Path: "+file.getAbsolutePath());
        while ((st = br.readLine()) != null){
            System.out.println(st);
        }
    }
}
