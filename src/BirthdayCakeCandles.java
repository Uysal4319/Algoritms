import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BirthdayCakeCandles {

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
        int max = ar[0];
        int maxCount = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == max) {
                maxCount++;
            }
        }

        return maxCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[] ar = new int[5];
        // enter 5 integer value
        for (int i = 0; i < 4; i++) {
            ar[i] = scanner.nextInt();
        }

        System.out.println(birthdayCakeCandles(ar));

        scanner.close();
    }
}
