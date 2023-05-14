package J18_MultidimensionalArrays_PresentationLab;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfAllElementsOfMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        int rows = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);

        int[][] matrix = readMatrix(scanner,rows,col);

        System.out.println(rows);
        System.out.println(col);

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }

        System.out.println(sum);
    }

    public static int[][] readMatrix (Scanner scanner, int rows, int col){

        int[][] matrix = new int[rows][col];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        return matrix;
    }
}
