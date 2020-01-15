package CodingToAnInterfaceExample.Implementation;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.StringWriter;
import java.util.*;

import CodingToAnInterfaceExample.ourInterface.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
/*public class FileProcessorImpl1 implements FileProcessor {

    public String getFileName(){

        System.out.println("Enter the directory name:" );

        return null;
    }
    public String setFileName(String FileName){

        return FileName;

    }
    public void processing_logic()  throws Exception{

        //Scanner class for taking input
        Scanner Directory_Name = new Scanner(System.in);
        String Directory_Name_Scanner = setFileName(Directory_Name.nextLine());

        //Reading the directory
        File Directory_reader = new File(Directory_Name_Scanner);

        //Iterating through each files
        for(File file : Directory_reader.listFiles()) {

            ////Iterating Through  .json files
            if (file.getName().endsWith(".json")){

                System.out.println("===============================================");
               // System.out.println("JSON FILE :-"+file_list.getName());
                System.out.println("===============================================");

                //Initializing ObjectMapper class it provides functionality for reading json files.
                ObjectMapper mapperObj = new ObjectMapper();
                //Map<String,JSONArray> Read_Mappper_Obj = mapperObj.readValue(new File(String.valueOf(file_list)), new TypeReference<HashMap<String, Object>>() {});

                System.out.println("HASHMAP:-");
                //iterating through each JSONObject
                //for (Map.Entry<String, JSONArray> JsonObjectEntry : Read_Mappper_Obj.entrySet()) {

                    //Converting ArrayList to HashMap
                   if (JsonObjectEntry.getValue() instanceof ArrayList) {

                        //Putting JSONArray in ArrayList
                       HashMap<String, JSONArray> jsonObjectHashMap = new HashMap<>();
                        ArrayList<HashMap<JSONObject, JSONObject>> jsonlist = new ArrayList<>();
                        jsonlist.addAll(JsonObjectEntry.getValue());
                        System.out.println(JsonObjectEntry.getKey());

                        //Putting ArrayList in HashMap
                        for (HashMap hashMap : jsonlist){
                            jsonObjectHashMap.putAll(hashMap);
                            System.out.println(jsonObjectHashMap.entrySet()+"\n");
                        }
                    }

                else {
                       HashMap<String, JSONArray> jsonObjectHashMap = new HashMap<>();

                    System.out.println(JsonObjectEntry.getKey()+"="+ JsonObjectEntry.getValue() );

                }
                }
            }
            ////Iteraing through .xml files
            if (file_list.getName().endsWith(".xml")) {

                File inputFile = new File(String.valueOf(file_list));

                System.out.println("================================================");
                System.out.println( "XML FILE :-"+inputFile.getName());
                System.out.println("================================================");

                //parsing the xml files
                DocumentBuilderFactory documentBuilderFactory =  DocumentBuilderFactory.newInstance();
                DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
                Document document_parsed = documentBuilder.parse(inputFile);

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

    }

    public  static  void main(String[] args) throws Exception {
        FileProcessorImpl1 obj = new FileProcessorImpl1() ;
        obj.getFileName();
        obj.processing_logic();
        System.out.println("================END====================");
    }


}*/
