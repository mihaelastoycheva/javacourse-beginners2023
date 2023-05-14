package J8_DataTypes_Presentation;
import java.util.Scanner;

public class CenturiesToMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int centuries = Integer.parseInt(scanner.nextLine());

        int years = centuries * 100;
        System.out.println("Years: " + years);

        float days = (float) years * 365.242F;
        System.out.printf("Days: %.0f\n", days);

        long hours = (int) days * 24L;
        System.out.println("Hours: " + hours);

        long minutes = hours * 60L;
        System.out.println("Minutes: " + minutes);

//        char symbol = '\u8449';
//        System.out.println(symbol);

    }
}
