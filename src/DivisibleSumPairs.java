import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DivisibleSumPairs {

    // Complete the divisibleSumPairs function below.
    static int divisibleSumPairs(int n, int k, int[] ar) {
        int count = 0;
        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if ((ar[i] + ar[j]) % k == 0) {
                    count++;
                }
            }
        }

        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        int n = scanner.nextInt();

        int k = scanner.nextInt();
        int[] ar = new int[n];


        for (int i = 0; i < n; i++) {
            ar[i] = scanner.nextInt();
        }

        int result = divisibleSumPairs(n, k, ar);

        System.out.println(result);

        scanner.close();
    }
}
