import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class BetweenTwoSets {

    /*
     * Complete the getTotalX function below.
     */
    static int getTotalX(int[] a, int[] b) {
   return 1; }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //example input -4 3 -9 0 4 1
        int m = scan.nextInt();
        int n = scan.nextInt();

        int[] a = new int[m];

        for (int i = 0; i < m; i++) {
            a[i] = scan.nextInt();
        }

        int[] b = new int[n];

        for (int i = 0; i <n; i++) {
            b[i] = scan.nextInt();
        }
        System.out.println(getTotalX(a,b));
    }
}