        import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;

public class BreakingTheRecords {

    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {
        int[] result = new int[2];
        result[0] = 0;
        result[1] = 0;
        int high = scores[0];
        int low = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > high) {
                high = scores[i];
                result[0]++;
            }
            if (scores[i] < low) {
                low = scores[i];
                result[1]++;
            }
        }

    return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }

        int[] result = breakingRecords(scores);
        System.out.println(result[0]+" "+ result[1]);
    }
}
