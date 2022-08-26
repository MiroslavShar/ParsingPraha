import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*File city = new File("city.json");
        File district = new File("district.json");
        File edge = new File("edge.json");

        Scanner scanner = new Scanner(city);


        while (scanner.hasNext()) {
            String plikCity = scanner.nextLine();
            System.out.println(plikCity);
        }

         */

        GsonParser parser = new GsonParser();
        Root root = parser.parse();

        System.out.println("Root" + root.toString());






    }
}
