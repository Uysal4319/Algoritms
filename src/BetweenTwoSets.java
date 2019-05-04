import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class BetweenTwoSets {

    /*
     * Complete the getTotalX function below.
     */
    static int getTotalX(int[] a, int[] b) {
        int[] divided = new int[100];
        int count = 0;
        int biggerB = b[0];
        int biggerA = a[0];
        for(int i = 0;i<b.length;i++){
            for (int j =0; j<b.length-1;j++){
              if(b[j+1] < b[j]){
                  biggerB = b[j];
                  b[j]= b[j+1];
                  b[j+1]=biggerB;
              }
            }
        }

        for(int i = 0;i<a.length;i++){
            for (int j =0; j<a.length-1;j++){
                if(a[j+1] < a[j]){
                    biggerA = a[j];
                    a[j]= a[j+1];
                    a[j+1]=biggerA;
                }
            }
        }

        for (int i = a[a.length - 1]; i <= b[0]; i++) {
            if(a.length>1){
                boolean divideFlag = true;
                for (int j = 0; j < a.length ; j++) {
                    if (i % a[j] != 0) {
                     divideFlag = false;
                    }
                }
                if (divideFlag){
                    divided[count] = i;
                    count++;
                }
            }else if (a.length == 1){
                boolean divideFlag = true;
                for (int j = 0; j < a.length ; j++) {
                    if (i % a[j] != 0) {
                       divideFlag =false;
                    }
                }
                if (divideFlag){
                    divided[count] = i;
                    count++;
                }
            }

        }


        int result = 0;
        while (count > 0) {
            boolean flag = true;
            for (int i = 0; i < b.length; i++) {
                if (b[i] % divided[count - 1] != 0) {
                    flag = false;
                }
            }
            if (flag) {
                result++;
            }
            count--;
        }

        return result;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int m = scan.nextInt();
        int n = scan.nextInt();

        int[] a = new int[m];

        for (int i = 0; i < m; i++) {
            a[i] = scan.nextInt();
        }

        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            b[i] = scan.nextInt();
        }
        System.out.println(getTotalX(a, b));
    }
}