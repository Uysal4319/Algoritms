import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class AppleAndOrange {

    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int[] difApples = new int[apples.length];
        int[] difOranges = new int[oranges.length];
        int appleCount = 0;
        int orangeCount = 0;
        for (int i = 0; i < apples.length; i++) {
            difApples[i] = a + apples[i];
            if (s <= difApples[i] && difApples[i] <= t) {
                appleCount++;
            }
        }
        for (int i = 0; i < oranges.length; i++) {
            difOranges[i] = b + oranges[i];
            if (s <= difOranges[i] && difOranges[i] <= t) {
                orangeCount++;
            }
        }
        System.out.println(appleCount);
        System.out.println(orangeCount);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] st = scanner.nextLine().split(" ");

        int s = Integer.parseInt(st[0]);

        int t = Integer.parseInt(st[1]);

        String[] ab = scanner.nextLine().split(" ");

        int a = Integer.parseInt(ab[0]);

        int b = Integer.parseInt(ab[1]);

        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);


        int[] apples = new int[m];

        for (int i = 0; i < m; i++) {
            apples[i] = scanner.nextInt();
        }

        int[] oranges = new int[n];

        for (int i = 0; i < n; i++) {
            oranges[i] = scanner.nextInt();
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);

        scanner.close();
    }
}
