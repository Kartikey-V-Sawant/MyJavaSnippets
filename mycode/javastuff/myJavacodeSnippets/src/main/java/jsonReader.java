
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.Iterator;

public class jsonReader {
    public static void main(String args[])throws Exception {
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader("src/main/resources/employees.json"));
        JSONObject jsonObject = (JSONObject) obj;

        String name = (String) jsonObject.get("Name");
        String author = (String) jsonObject.get("Author");
        JSONArray companyList = (JSONArray) jsonObject.get("Company List");

        System.out.println("Name: " + name);
        System.out.println("Author: " + author);
        System.out.println("\nCompany List:");

        Iterator<String> iterator = companyList.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
    }
}
