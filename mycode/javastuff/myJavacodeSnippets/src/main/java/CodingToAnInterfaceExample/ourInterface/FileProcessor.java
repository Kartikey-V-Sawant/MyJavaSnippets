package CodingToAnInterfaceExample.ourInterface;

public interface FileProcessor {

    public String getFileName();

    void setFileName(String FileName);

    void processing_logic() throws Exception ;

}
