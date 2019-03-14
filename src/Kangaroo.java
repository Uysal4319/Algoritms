import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Kangaroo {

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        int first=x1;
        int second=x2;
        for(int i =0 ;i<1000;i++){
            first += v1;
            second += v2;
            if (first==second){
                System.out.println(first+" "+second);
                return "YES";

            }
        }
        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        int x1 = scanner.nextInt();

        int v1 = scanner.nextInt();

        int x2 = scanner.nextInt();

        int v2 = scanner.nextInt();

        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
        scanner.close();
    }
}
