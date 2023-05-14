package J18_MultidimensionalArrays_PresentationLab;

import java.util.Scanner;

public class MaximumSumOf2X2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        int rows = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);

        int[][] matrix = SumOfAllElementsOfMatrix.readMatrix(scanner,rows,col);

        int maxSum = Integer.MIN_VALUE;
        int tempSum = 0;
        String firstLine = "";
        String secondLine = "";

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ((j == matrix[i].length - 1) || (i == matrix.length - 1)){
                    break;
                } else {
                    tempSum = matrix[i][j] + matrix[i][j+1] + matrix[i+1][j] + matrix[i+1][j+1];
                    if (tempSum > maxSum){
                        maxSum = tempSum;
                        firstLine = matrix[i][j] + " " + matrix[i][j+1];
                        secondLine = matrix[i+1][j] + " " + matrix[i+1][j+1];
                    }

                }
            }
        }

        System.out.println(firstLine);
        System.out.println(secondLine);
        System.out.println(maxSum);
    }
}
