import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("city.json");

        Scanner scanner = new Scanner(file);


        while (scanner.hasNext()) {
            String plikCity = scanner.nextLine();
            System.out.println(plikCity);
        }






    }
}
