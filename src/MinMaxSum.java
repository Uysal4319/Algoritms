import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class MinMaxSum {

    /*
     * Complete the simpleArraySum function below.
     */
    static void miniMaxSum(long[] ar) {
        long sum = 0;
        long temp = 0;
    for (int j =0 ; j< ar.length-1;j++){
        for (int i = 0; i < ar.length - 1; i++) {
            if (ar[i] > ar[i + 1]) {
                temp = ar[i];
                ar[i] = ar[i + 1];
                ar[i + 1] = temp;

            }

        }
    }
        for (int i = 0; i < ar.length - 1; i++) {
            sum += ar[i];
            if (i == ar.length - 2) {
                sum += ar[i + 1];
            }
        }


        System.out.println((sum - ar[ar.length - 1]) + " " + (sum - ar[0]));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        long[] ar = new long[5];

        // enter 5 integer value
        for (int i = 0; i < 5; i++) {
            ar[i] = scanner.nextLong();
        }

        miniMaxSum(ar);
    }
}
