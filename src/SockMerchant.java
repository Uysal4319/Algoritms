import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int count = 0 ;
        int mostly =0;
        int max =0;

        Map<Integer,Integer> map = new HashMap<>();

        for (int i =0 ;i<n;i++){
            map.merge(ar[i],1 , Integer::sum);
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()/2>=1){
                count +=entry.getValue()/2;
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();


        int[] ar = new int[n];


        for (int i = 0; i < n; i++) {
            ar[i] =  scanner.nextInt();
        }

        int result = sockMerchant(n, ar);

        System.out.println(result);

        scanner.close();
    }
}
