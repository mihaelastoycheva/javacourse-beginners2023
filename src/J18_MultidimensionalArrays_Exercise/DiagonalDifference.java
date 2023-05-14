package J18_MultidimensionalArrays_Exercise;

import J18_MultidimensionalArrays_PresentationLab.PrintDiagonalsOfSquareMatrix;

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = PrintDiagonalsOfSquareMatrix.readMatrix(scanner,size,size);

        int sumFirst = 0;
        int sumSec = 0;

        for (int i = 0; i < matrix.length; i++) {
            sumFirst += matrix[i][i];
        }

        for (int i = 0; i < matrix.length; i++) {
            sumSec += matrix[matrix.length-1-i][i];
        }

        System.out.println(Math.abs(sumFirst - sumSec));
    }
}
