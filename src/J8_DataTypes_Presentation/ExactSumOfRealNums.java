package J8_DataTypes_Presentation;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        BigDecimal sum = new BigDecimal(0); //Деклариране на BigDecimal с начална стойност = 0
        BigDecimal number; //Просто деклариране на BigDecimal

        for (int i = 0; i < n; i++) {
            number = new BigDecimal(scanner.nextLine()); //Четене от конзолата на BigDecimal число
            sum = sum.add(number); //Добавяне на BigDecimal число към сумата, която също е от тип BigDecimal
        }
        System.out.println(sum);
    }
}
