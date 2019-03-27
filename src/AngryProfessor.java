import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class AngryProfessor {

    // Complete the angryProfessor function below.
    static String angryProfessor(int k, int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
           if(a[i]<=0){
               count++;
           }
        }
        if(count<k)
            return "YES";
        else{
            return "NO";
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int t = scanner.nextInt();

        for (int tItr = 0; tItr < t; tItr++) {

            int n = scanner.nextInt();

            int k = scanner.nextInt();

            int[] a = new int[n];


            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            String result = angryProfessor(k, a);
            System.out.println(result);
        }


        scanner.close();
    }
}
