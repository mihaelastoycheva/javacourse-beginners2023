package J18_MultidimensionalArrays_Exercise;

import J18_MultidimensionalArrays_PresentationLab.CompareMatrices;
import J18_MultidimensionalArrays_PresentationLab.PrintDiagonalsOfSquareMatrix;

import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] sizes = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(sizes[0]);
        int col = Integer.parseInt(sizes[1]);

        int[][] matrix = PrintDiagonalsOfSquareMatrix.readMatrix(scanner, rows, col);

        String[] input = scanner.nextLine().split("\\s+");

        while(input[0].equals("swap")){

            int row1 = Integer.parseInt(input[1]);
            int col1 = Integer.parseInt(input[2]);
            int row2 = Integer.parseInt(input[3]);
            int col2 = Integer.parseInt(input[4]);

            if (row1 > rows - 1 || row2 > rows - 1 || row1 < 0 || row2 < 0
                    || col1 > col - 1 || col2 > col - 1 || col1 < 0 || col2 < 0){
                System.out.println("Invalid input");
            } else {
                int temp = matrix[row1][col1];
                matrix[row1][col1] = matrix[row2][col2];
                matrix[row2][col2] = temp;
                CompareMatrices.printMatrix(matrix);
            }
            input = scanner.nextLine().split("\\s+");
        }
    }
}
