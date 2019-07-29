import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CircularArrayRotation {
    public static int[] circularArrayRotation(int[] a, int k, int[] queries) {

        int[] result = new int[a.length];
        for (int j = 0; j<k;j++){
            int lastIndex = queries[queries.length-1];
            for (int i = 1; i<queries.length;i++){
               queries[queries.length-i] = queries[queries.length-i-1];
            }
            queries[0] =lastIndex;
        }
            for (int i = 0 ; i< a.length; i++){
                result[i] = queries[a[i]];
                System.out.println(result[i]);
            }
            return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int q = scanner.nextInt();

        int[] a = new int[n];
        int[] queries = new int[q];

        for (int i = 0 ;i<a.length ;i++){
            queries[i] =scanner.nextInt() ;
        }


        for (int i = 0 ;i<a.length ;i++){
            a[i] =scanner.nextInt() ;
        }

        int[] result = circularArrayRotation(a, k, queries);


    }
}
