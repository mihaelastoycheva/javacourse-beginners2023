package J18_MultidimensionalArrays_PresentationLab;

import java.util.Arrays;
import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int col = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = readMatrix(scanner, rows, col);
        char[][] secondMatrix = readMatrix(scanner,rows,col);

        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix[i].length; j++) {
                if (firstMatrix[i][j] != secondMatrix[i][j]){
                    secondMatrix[i][j] = '*';
                }
            }
        }

        for (int i = 0; i < secondMatrix.length; i++) {
            for (int j = 0; j < secondMatrix[i].length; j++) {
                System.out.print(secondMatrix[i][j] + " ");
            }
            System.out.println();
        }


    }

    public static char[][] readMatrix (Scanner scanner, int rows, int col){
        char[][] matrix = new char[rows][col];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = scanner.nextLine().replace(" ", "").toCharArray();
        }
        return matrix;
    }
}
