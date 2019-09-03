import java.util.Scanner;

public class SherlockAndSquares {
    // TODO this algorithm didn't complete.
    public static int squares(int a, int b) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            double root = (Math.sqrt(i));

            if (i%root == 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int b = scanner.nextInt();

        System.out.println(squares(a, b));
    }

}
