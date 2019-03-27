import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BeautifulDaysAtTheMovie {

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
        int count = 0;
        while (i <= j) {
            String s = String.valueOf(i);
            String reversed = "";
            for (int g = s.length() -1; g >= 0; g--) {
                reversed = reversed + s.charAt(g);
            }
            int first = Integer.parseInt(s);
            int second = Integer.parseInt(reversed);

            int difference = Math.abs((first - second));

            if (difference % k == 0) {
                count++;
            }
            i++;
        }
    return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        int i = scanner.nextInt();

        int j = scanner.nextInt();

        int k = scanner.nextInt();

        int result = beautifulDays(i, j, k);

        System.out.println(result);

        scanner.close();
    }
}
