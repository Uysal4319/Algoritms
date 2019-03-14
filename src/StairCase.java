import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StairCase {

    // Complete the staircase function below.
    static void staircase(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int s = 0; s < i + 1; s++) {
                System.out.print("#");
            }
            System.out.print("\n");
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        staircase(n);

        scanner.close();
    }
}
