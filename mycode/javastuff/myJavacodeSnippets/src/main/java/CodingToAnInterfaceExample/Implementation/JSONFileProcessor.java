package CodingToAnInterfaceExample.Implementation;

import CodingToAnInterfaceExample.ourInterface.FileProcessor;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class JSONFileProcessor implements FileProcessor {

    private String filename = null;
    public String getFileName() {
        return filename;
    }
    public void setFileName(String FileName) { filename = FileName; }

    public void processing_logic() throws Exception {

        //  objectmapper class is used to serialize java objects into json  & deserialize json string to java objects.
        ObjectMapper mapperObj = new ObjectMapper();

        //  JsonParser is used for parsing JSON object into java Object..
        JSONParser jsonParser= new JSONParser();
        Object obj=jsonParser.parse(new FileReader(String.valueOf(filename)));
        //  typecasting java to json - But why ????
        JSONObject jsonObject = (JSONObject) obj;

        Map<String, ArrayList> Read_Mappper_Obj = mapperObj.readValue(String.valueOf(jsonObject), new TypeReference<HashMap<String, Object>>() {});
         for (Map.Entry<String, ArrayList> JsonObjectEntry : Read_Mappper_Obj.entrySet())
         {
                HashMap<String, ArrayList> jsonObjectHashMap = new HashMap<String, ArrayList>();
                jsonObjectHashMap.put(JsonObjectEntry.getKey(),JsonObjectEntry.getValue());
                System.out.println(jsonObjectHashMap.entrySet());
        }
    }
}

