import java.io.IOException;
import java.util.Scanner;

public class ElectronicsShop {

    /*
     * Complete the getMoneySpent function below.
     */
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int max = 0;
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                if ((keyboards[i] + drives[j]) > max && (keyboards[i] + drives[j]) <= b) {
                    max = (keyboards[i] + drives[j]);
                }
            }
        }
        if (max==0){
            return -1;
        }
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        int b = scanner.nextInt();
        int n = scanner.nextInt();

        int m = scanner.nextInt();
        int[] keyboards = new int[n];
        int[] drives = new int[m];


        for (int keyboardsItr = 0; keyboardsItr < n; keyboardsItr++) {
            keyboards[keyboardsItr]= scanner.nextInt();
        }


        for (int drivesItr = 0; drivesItr < m; drivesItr++) {
            drives[drivesItr] = scanner.nextInt();
        }

        /*
         * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
         */

        int moneySpent = getMoneySpent(keyboards, drives, b);

        System.out.println(moneySpent);

        scanner.close();
    }
}
