package J3_ConditionalStatementsAdvanced_Presentation;

import java.util.Scanner;

public class QuarterShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        double result = 0;

        if (city.equals("Sofia")){
            if (product.equals("coffee")){
                result = quantity * 0.50;
            } else if (product.equals("water")){
                result = quantity * 0.80;
            } else if (product.equals("beer")){
                result = quantity * 1.20;
            } else if (product.equals("sweets")){
                result = quantity * 1.45;
            } else if (product.equals("peanuts")){
                result = quantity * 1.60;
            }

        } else if (city.equals("Plovdiv")){
            if (product.equals("coffee")){
                result = quantity * 0.40;
            } else if (product.equals("water")){
                result = quantity * 0.70;
            } else if (product.equals("beer")){
                result = quantity * 1.15;
            } else if (product.equals("sweets")){
                result = quantity * 1.30;
            } else if (product.equals("peanuts")){
                result = quantity * 1.50;
            }

        } else if (city.equals("Varna")){
            if (product.equals("coffee")){
                result = quantity * 0.45;
            } else if (product.equals("water")){
                result = quantity * 0.70;
            } else if (product.equals("beer")){
                result = quantity * 1.10;
            } else if (product.equals("sweets")){
                result = quantity * 1.35;
            } else if (product.equals("peanuts")){
                result = quantity * 1.55;
            }
        }
        System.out.printf("%.1f", result);
    }
}

