import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class DrawingBook {

    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) {
        int forward = 0;
        int reversed = 0;

        if (p != 1) {
            double result = ((double) p - 1) / 2;
            forward = (int) Math.ceil(result);
        }

        if (p != n) {
            if (n % 2 == 0) {
                if (n - 1 == p) {
                    reversed = 0;
                }
                double result = ((double) n - (double) p) / 2;
                reversed = (int) Math.ceil(result);
            } else if (n % 2 == 1) {
                double result = ((double) n - (double) p) / 2;
                reversed = (int) Math.floor(result);


            }
        }
        if (forward <= reversed) {
            return forward;
        }
        return reversed;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();


        int p = scanner.nextInt();


        int result = pageCount(n, p);

        System.out.println(result);

        scanner.close();
    }
}
