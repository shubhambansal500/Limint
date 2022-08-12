package parsecsv;

import java.io.FileNotFoundException;

public class ParserFactory {
    public Parser getParser(String parser) throws FileNotFoundException {
        if(parser.isEmpty()){
            return null;
        }
        switch (parser) {
            case "CSV":
                return new CsvParser();
            case "JSON":
                return new JsonParser();
            default:
                throw new FileNotFoundException();
        }

    }
}
