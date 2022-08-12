package parsecsv;

import entity.Order;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class JsonParser implements Parser{

    @Override
    public void parse(String filePath) {
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader(filePath));
            JSONArray array = new JSONArray();
            array.add(obj);
            System.out.println(array.toJSONString());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
