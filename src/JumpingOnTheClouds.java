import java.util.Scanner;

public class JumpingOnTheClouds {
    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c, int k) {
        int count = c.length;
        int index = 0;
        int result = 100;

// TODO this algorithm didn't complete.

        while (index < c.length) {

            if (c[index % c.length] == 1) {
                result -= k;
            }
            result -= (k-1);
            index = index + k;

            if (c.length-1-index <= k){
                if (c[index % c.length] == 1) {
                    result -= k;
                }
                result -= (k-1);
                index = index + k;

            }
        }

        return result;
    }

    private static final Scanner scaner = new Scanner(System.in);

    public static void main(String[] args) {


        int arraySize = scaner.nextInt();
        int k = scaner.nextInt();
        int[] cloud = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            cloud[i] = scaner.nextInt();
        }

        System.out.println(jumpingOnClouds(cloud, k));

    }

}
