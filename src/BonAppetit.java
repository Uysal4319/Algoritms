import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class BonAppetit {

    // Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> bill, int k, int b) {
        int sum =0;
        int change=0;
        bill.remove(k);
        for (Integer i : bill ){
            sum += i;
        }

        change=b-(sum/2);

        if(change>0){
            System.out.println(change);
        }else if(change<0){
            System.out.println(change);
        }else {
            System.out.println("Bon Appetit");
        }
    }
    private static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        List<Integer> bill = new ArrayList<>();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        for (int i = 0;i<n;i++){
            bill.add(scanner.nextInt());
        }



        int b = scanner.nextInt();

        bonAppetit(bill, k, b);

    }
}
