import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CatsAndMouse {

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
        int zx = Math.abs(z - x);
        int zy = Math.abs(z - y);
        if (zx < zy) {
            return "Cat A";
        } else if (zx > zy) {
            return "Cat B";
        } else {
            return "Mouse C";
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int q = scanner.nextInt();

        for (int qItr = 0; qItr < q; qItr++) {

            int x = scanner.nextInt();

            int y = scanner.nextInt();

            int z = scanner.nextInt();

            String result = catAndMouse(x, y, z);

            System.out.println(result);
        }


        scanner.close();
    }
}
