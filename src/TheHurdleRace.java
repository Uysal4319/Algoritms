import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TheHurdleRace {

    // Complete the hurdleRace function below.
    static int hurdleRace(int k, int[] height) {
        int result = 0;
        int max = 0;

        for (int i = 0; i < height.length; i++) {
            if (height[i] > max) {
                max = height[i];
            }
        }
        if(max<k)
            return 0;
        return max-k;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        int n = scanner.nextInt();

        int k = scanner.nextInt();

        int[] height = new int[n];


        for (int i = 0; i < n; i++) {

            height[i] = scanner.nextInt();
        }

        int result = hurdleRace(k, height);
        System.out.println(result);

        scanner.close();
    }
}
