import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DiagonalDifference {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {
        int rightDiagonal = 0;
        int leftDiagonal = 0;

        for (int i = 0; i < arr.length; i++) {
            leftDiagonal += arr[i][i];
            rightDiagonal += arr[i][arr.length - 1 - i];

        }

        return Math.abs(leftDiagonal - rightDiagonal);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int matrix[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println(diagonalDifference(matrix));

        scanner.close();
    }
}
