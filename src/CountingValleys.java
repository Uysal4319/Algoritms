import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        // D = 68
        // U=85
        int frequence = 0;
        int valley = 0;
        for (int i = 0 ; i< n ;i++){

            if(s.charAt(i)==85){
                frequence++;
            }

            if(s.charAt(i)==68){
                if(frequence==0){
                    valley++;
                }
                frequence--;

            }
        }

    return  valley;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        int n = scanner.nextInt();

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        System.out.println(result);

        scanner.close();
    }
}
