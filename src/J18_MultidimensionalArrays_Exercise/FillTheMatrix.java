package J18_MultidimensionalArrays_Exercise;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int size = Integer.parseInt(input[0]);
        String type = input[1];


        int[][] matrix = new int[size][size];

        if (type.equals("A")){
            matrix = generateMatrixTypeA(size);
        } else if (type.equals("B")){
            matrix = generateMatrixTypeB(size);
        }

        printMatrix(matrix, size);
    }
    public static int[][] generateMatrixTypeA (int size){
        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == 0){
                    matrix[i][j] = i + 1;
                    continue;
                }
                matrix[i][j] += matrix[i][j-1] + size;
            }
        }
        return matrix;
    }

    public static int[][] generateMatrixTypeB (int size){
        int[][] matrix = new int[size][size];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 0) {
                    if (j == 0) {
                        matrix[i][j] = i + 1;
                    } else if (j % 2 == 0) {
                        matrix[i][j] = matrix[i][j - 1] + 1;
                    } else {
                        matrix[i][j] = (size * 2) + matrix[i][j - 1] - 1;
                    }
                } else {
                    if (j == 0){
                        matrix[i][j] = i + 1;
                    } else if (j % 2 == 0){
                        matrix[i][j] = matrix[i-1][j] + 1;
                    } else {
                        matrix[i][j] = matrix[i-1][j] - 1;
                    }
                }
            }
        }
        return matrix;
    }
    public static void printMatrix (int[][] matrix, int size){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
