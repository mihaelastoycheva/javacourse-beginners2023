package J18_MultidimensionalArrays_Exercise;

import J18_MultidimensionalArrays_PresentationLab.CompareMatrices;
import J18_MultidimensionalArrays_PresentationLab.SumOfAllElementsOfMatrix;

import java.util.Scanner;

public class MaximalSumOf3X3Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = CompareMatrices.readMatrix(scanner);

        int maxSum = Integer.MIN_VALUE;
        int tempSum = 0;
        String firstLine = "";
        String secondLine = "";
        String thirdLine = "";

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j + 2 >= matrix[i].length || i + 2 >= matrix.length){
                    break;
                } else {
                    tempSum = matrix[i][j] + matrix[i][j+1] + matrix[i][j+2]
                            + matrix[i+1][j] + matrix[i+1][j+1] + matrix[i+1][j+2]
                            + matrix[i+2][j] + matrix[i+2][j+1] + matrix[i+2][j+2];
                    if (tempSum > maxSum){
                        maxSum = tempSum;
                        firstLine = matrix[i][j] + " " + matrix[i][j+1] + " " + matrix[i][j+2];
                        secondLine = matrix[i+1][j] + " " + matrix[i+1][j+1] + " " + matrix[i+1][j+2];
                        thirdLine = matrix[i+2][j] + " " + matrix[i+2][j+1] + " " + matrix[i+2][j+2];
                    }

                }
            }
        }
        System.out.println("Sum = " + maxSum);

        System.out.println(firstLine);
        System.out.println(secondLine);
        System.out.println(thirdLine);
    }
}
