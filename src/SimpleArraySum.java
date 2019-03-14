import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class SimpleArraySum {

    /*
     * Complete the simpleArraySum function below.
     */
    static int simpleArraySum(int[] ar) {
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum = sum + ar[i];
        }
        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int[] ar = new int[5];

        // enter 5 integer value
        for (int i = 0; i < 5; i++) {
            ar[i] = scanner.nextInt();
        }

        System.out.println(simpleArraySum(ar));

    }
}
