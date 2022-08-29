import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GsonParser parser = new GsonParser();
        Root root = parser.parse();
        //System.out.println("Root" + root.toString());

        //GsonParserDistrict parserDistrict = new GsonParserDistrict();
        //RootDistrict koren = parserDistrict.parseDistrict();
        //System.out.println("Koren " + koren.toString());

        GsonParserCity parserCity = new GsonParserCity();
        RootCity city = parserCity.parse();
        //System.out.println("goroda " + city.toString());

        //Scanner zapros = new Scanner(System.in);
        //String s = zapros.nextLine();

       // List er = root.getSpisok();
        //System.out.println(er);

        GsonParserDistrict parserDistrict = new GsonParserDistrict();
        RootDistrict koren = parserDistrict.parseDistrict();
        System.out.println(koren);
















    }
}
