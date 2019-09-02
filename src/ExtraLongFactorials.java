import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {
    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {
        BigInteger result = BigInteger.valueOf(1);

        for (int i = 1; i <= n; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
            System.out.println(result.toString());

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        extraLongFactorials(n);
    }
}
