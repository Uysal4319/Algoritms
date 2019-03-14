import java.io.IOException;
import java.util.Scanner;

public class AveryBigSum {

    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
        long sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum = sum + ar[i];
        }
        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        long[] ar = new long[5];
        // reference input 1000000001 1000000002 1000000003 1000000004 1000000005

        System.out.println("Enter 5 big value");
        for (int i = 0; i < 5; i++) {
            ar[i] = scanner.nextLong();
        }

        long result = aVeryBigSum(ar);
        System.out.println(result);
        scanner.close();
    }
}
