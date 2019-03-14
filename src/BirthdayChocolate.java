import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BirthdayChocolate {

    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        for (int j = 0; j <= s.size() - m; j++) {
            int sum = 0;
            for (int i = 0; i < m; i++) {
                sum += s.get(j + i);
            }
            if (sum == d) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        List<Integer> s = new ArrayList<Integer>();

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            s.add(scanner.nextInt());
        }

        int d = scanner.nextInt();

        int m = scanner.nextInt();

        int result = birthday(s, d, m);

        System.out.println(result);

    }
}
