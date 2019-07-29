import java.util.Scanner;

public class SaveThePrisoner {
    static int saveThePrisoner(int n, int m, int s) {
        int count = s;
        while (m != 0) {

            for (int i = s; i <= n; i++) {
                m--;
                if (m == 0) {
                    count = i;
                    break;
                }

            }

            s = 1;

        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("how many interval");
        int interval = scanner.nextInt();

        for (int i = 0; i < interval; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int s = scanner.nextInt();

            System.out.println(saveThePrisoner(n, m, s));
        }

    }
}
