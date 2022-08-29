import com.google.gson.Gson;

import java.io.FileReader;

public class GsonParser {
    public Root parse() {

        Gson gson = new Gson();


        try(FileReader reader = new FileReader("edge.json")) {

            return gson.fromJson(reader, Root.class);
        } catch (Exception e) {
            System.out.println("Parsing error " + e.toString());
        }

        return null;
    }

}
