package J18_MultidimensionalArrays_Exercise;

import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int col = Integer.parseInt(scanner.nextLine());

        char[][][] finalCube = generatePalindromeCube(rows,col);

        printCube(finalCube);
    }

    public static char[][][] generatePalindromeCube(int rows, int col){
        char[][][] cube = new char[rows][col][3];

        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[i].length; j++) {
                for (int k = 0; k < 3; k++) {
                    if (j == 0){
                        cube[i][j][k] = (char) (97 + i);
                    } else {
                        if (k == 0 || k == 2){
                            cube[i][j][k] = (char) (97 + i);
                        } else {
                            cube[i][j][k] = (char) (cube[i][j-1][k] + 1);
                        }
                    }
                }
            }
        }
        return cube;
    }

    public static void printCube (char[][][] cube){
        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[i].length; j++) {
                for (int k = 0; k < cube[i][j].length; k++) {
                    System.out.print(cube[i][j][k]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
