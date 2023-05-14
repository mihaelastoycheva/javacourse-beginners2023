package J5_WhileLoop_Exercise;

import java.util.Scanner;

public class TheOldLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String book = scanner.nextLine();
        String searchingForBook = scanner.nextLine();

        int counter = 0;

        while (!searchingForBook.equals(book)){
            searchingForBook = scanner.nextLine();
            counter++;
            if (searchingForBook.equals("No More Books")){
                System.out.printf("The book you search is not here!\nYou checked %d books.", counter);
                return;
            }
        }
        System.out.printf("You checked %d books and found it.", counter);
    }
}
