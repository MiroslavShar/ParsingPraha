import com.google.gson.Gson;

import java.io.FileReader;

public class GsonParserCity {
    public RootCity parse() {

        Gson gsonCity = new Gson();

        try(FileReader reader = new FileReader("city.json")) {

            return gsonCity.fromJson(reader, RootCity.class);
        } catch (Exception e) {
            System.out.println("Parsing error city " + e.toString());
        }

        return null;
    }
}
