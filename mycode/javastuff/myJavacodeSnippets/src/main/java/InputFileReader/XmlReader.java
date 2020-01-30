package InputFileReader;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XmlReader {
    public static void main(String args[]) throws Exception {
            File inputFile = new File("/home/kartikey.sawant/mycode/javastuff/mydummyproject/src/main/resources/book.xml");
            DocumentBuilderFactory documentBuilderFactory =  DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

            Document doc = documentBuilder.parse(inputFile);
//        doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("student");

            for(int t=0 ; t<nodeList.getLength();t++){
                Node node= nodeList.item(t);
                System.out.println("/Current Node"+node.getNodeName());
                if (node.getNodeType()==Node.ELEMENT_NODE){
                    Element element= (Element) node;
                    System.out.println("Student roll no:"+element.getAttribute("rollno"));
                    System.out.println("Student  first Name:"+element.getElementsByTagName("firstname").item(0).getTextContent());
                    System.out.println("Student last name:"+element.getElementsByTagName("lastname").item(0).getTextContent());
                    System.out.println("Student nick name:"+element.getElementsByTagName("nickname").item(0).getTextContent());
                }
            }

    }
}
