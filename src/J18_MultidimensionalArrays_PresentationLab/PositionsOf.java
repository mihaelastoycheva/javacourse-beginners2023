package J18_MultidimensionalArrays_PresentationLab;

import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = readMatrix(scanner);

        int searchedNum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == searchedNum){
                    System.out.println(i + " " + j);
                }
            }
        }
    }

    public static int[][] readMatrix (Scanner scanner){
        String[] input = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);

        int[][] matrix = new int[rows][col];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        return matrix;
    }
}
