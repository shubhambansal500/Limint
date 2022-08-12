package parsecsv;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencsv.bean.CsvToBeanBuilder;
import entity.Order;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class CsvParser implements Parser{

    @Override
    public void parse(String filePath){
        List<Order> beans = null;
        try {
            beans = new CsvToBeanBuilder(new FileReader(filePath))
                    .withType(Order.class)
                    .build()
                    .parse();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        convert(beans);
    }

    private void convert(List<Order> beans) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(beans);
            System.out.println(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
