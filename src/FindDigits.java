import java.util.Scanner;

public class FindDigits {

    public static int findDigits(int n) {
        String number = String.valueOf(n);
        int count = 0;


        for (int i = 0; i < number.length(); i++) {
            int letter = Integer.parseInt(String.valueOf(number.charAt(i)));
            if (letter != 0) {
                if(n%letter == 0){
                    count++;
                }

            }

        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(findDigits(n));
    }
}
