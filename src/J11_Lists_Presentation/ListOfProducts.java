package J11_Lists_Presentation;

import java.util.*;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countProducts = Integer.parseInt(scanner.nextLine());
        List<String> products = new ArrayList<>();

        for (int i = 0; i < countProducts; i++) {
            String product = scanner.nextLine();
            products.add(product);
        }
        Collections.sort(products);

        for (int i = 0; i < products.size(); i++) {
            System.out.println(i+1 + ". " + products.get(i));
        }
    }
}
