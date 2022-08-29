import com.google.gson.Gson;

import java.io.FileReader;

public class GsonParserDistrict {
    public RootDistrict parseDistrict() {
        Gson gsonDistrict = new Gson();

        try (FileReader reader = new FileReader("district.json")) {

            return gsonDistrict.fromJson(reader, RootDistrict.class);
        } catch (Exception e) {
            System.out.println("Parsing error district " + e.toString());
        }
        return null;
    }
}
