package J18_MultidimensionalArrays_PresentationLab;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = readMatrix(scanner,size,size);

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }

        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[matrix.length-1-i][i] + " ");
        }
    }
    public static int[][] readMatrix (Scanner scanner, int rows, int col){

        int[][] matrix = new int[rows][col];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        return matrix;
    }
}
