package J15_TextProcessing_Exercise;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.next();
        char[] firstArr = first.toCharArray();

        String second = scanner.next();
        char[] secondArr = second.toCharArray();

        int n = 0;

        int sum = 0;

        if (firstArr.length == secondArr.length){
            n = firstArr.length;
        } else if (firstArr.length < secondArr.length){
            n = firstArr.length;
        } else {
            n = secondArr.length;
        }

        for (int i = 0; i < n; i++) {
            sum += firstArr[i] * secondArr[i];
        }

        if (firstArr.length > secondArr.length){
            for (int i = n; i < firstArr.length; i++) {
                sum += firstArr[i];
            }
        } else {
            for (int i = n; i < secondArr.length; i++) {
                sum += secondArr[i];
            }
        }

        System.out.println(sum);
    }
}
