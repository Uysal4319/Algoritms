import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class DrawingBook {

    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) {
        int page=p*2;

        if (page> n){
            
        }
        for (int i = 0; i<p ;i++){
            
         }
        return n;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();


        int p = scanner.nextInt();


        int result = pageCount(n, p);

        System.out.println(result);

        scanner.close();
    }
}
