import java.util.Scanner;

public class SherlockAndSquares {

    public static int squares(int a, int b) {
        int count = 0;
        int result =0;
        for (int i = a; i <= b; i++) {
            double root = (Math.sqrt(i));

            if (i%root == 0){
                result = (int) root;
                break;
            }
        }

        if(result == 0){
            return 0;
        }

        while (result*result <= b){

            result++;
            count++;

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
