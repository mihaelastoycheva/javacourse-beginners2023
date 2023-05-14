package J18_MultidimensionalArrays_PresentationLab;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] firstMatrix = readMatrix(scanner);
        int[][] secondMatrix = readMatrix(scanner);

        printMatrix(firstMatrix);
        System.out.println();
        printMatrix(secondMatrix);

        if (areEqual(firstMatrix, secondMatrix)){
            System.out.println("Equal");
        } else System.out.println("Not equal");

    }

    public static boolean areEqual(int[][] firstMatrix, int[][] secondMatrix){
        if (firstMatrix.length != secondMatrix.length){
            return false;
        }

        for (int i = 0; i < firstMatrix.length; i++) {
            if (firstMatrix[i].length != secondMatrix[i].length){
                return false;
            }
            for (int j = 0; j < firstMatrix[i].length; j++) {
                if (firstMatrix[i][j] != secondMatrix[i][j]){
                    return false;
                }
            }
        }

        return true;
    }

    public static void printMatrix (int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
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
