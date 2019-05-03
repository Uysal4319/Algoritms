import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ViralAdvertising {

    // Complete the viralAdvertising function below.
    static int viralAdvertising(int n) {
        int sheared=5;
        int cumulative = 0;
        int liked=0;
        for(int i = 1 ;i<=n;i++){
            liked = sheared/2;
            cumulative += liked;
            sheared =(sheared/2) * 3;
        }
        return cumulative;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();

        int result = viralAdvertising(n);
        System.out.println(result);
        scanner.close();
    }
}
