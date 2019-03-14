import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;

public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int plus=0;
        int minus=0;
        for (int i =0;i<arr.length;i++) {
            if (arr[i] < 0) {
                minus++;
            } else if (arr[i] > 0) {
                plus++;
            }
        }


        System.out.println (String.format("%.6f", (double) plus / (double) arr.length));
        System.out.println(String.format("%.6f", (double) minus / (double) arr.length));
        System.out.println(String.format("%.6f", (double) (arr.length-(minus+plus)) / (double) arr.length));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
            //example input -4 3 -9 0 4 1
            int[] arr=new int[6];

            for (int i = 0; i < 6; i++) {
                arr[i] = scanner.nextInt();
            }

        plusMinus(arr);

        scanner.close();
    }
}
