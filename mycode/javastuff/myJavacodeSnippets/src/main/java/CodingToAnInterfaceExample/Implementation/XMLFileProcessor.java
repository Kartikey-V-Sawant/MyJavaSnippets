package CodingToAnInterfaceExample.Implementation;

import CodingToAnInterfaceExample.ourInterface.FileProcessor;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileReader;
import java.io.StringWriter;

public class XMLFileProcessor implements FileProcessor {

    private String filename = null;
    public String getFileName() {
        return filename;
    }
    public void setFileName(String FileName) { filename = FileName; }

    public void processing_logic() throws Exception {
                //parsing the xml files
                DocumentBuilderFactory documentBuilderFactory =  DocumentBuilderFactory.newInstance();
                DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
                Document document_parsed = documentBuilder.parse(String.valueOf(filename));

                TransformerFactory transformer_Factory = TransformerFactory.newInstance();
                Transformer transformer;
                transformer = transformer_Factory.newTransformer();

                //Print XML or Logs or Console
                StringWriter string_writer = new StringWriter();
                transformer.transform(new DOMSource(document_parsed), new StreamResult(string_writer));
                String xmlString = string_writer.getBuffer().toString();

                System.out.println(xmlString +"\n");
            }
        }
