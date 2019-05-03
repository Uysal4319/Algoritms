import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class UtopianTree {

    // Complete the utopianTree function below.
    static int utopianTree(int n) {
        int height = 0;
        for (int i = 0 ;i <= n ;i++){
            if(i%2==0){
                height++;
            }else if(i%2!=0){
                height = height*2;
            }
        }

        return height;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int t = scanner.nextInt();

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();

            int result = utopianTree(n);
            System.out.println(result);

        }


        scanner.close();
    }
}
