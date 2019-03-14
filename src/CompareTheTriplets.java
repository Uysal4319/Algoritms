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

public class CompareTheTriplets {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>();
        result.add(0);
        result.add(0);
        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) {
                result.set(0, result.get(0) + 1);
            } else if (a.get(i) < b.get(i)) {
                result.set(1, result.get(1) + 1);
            }
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        System.out.println("Enter 3 Alice's triplet");
        for (int i = 0; i < 3; i++) {
            a.add(scanner.nextInt());
        }
        System.out.println("Enter 3 Bob's triplet");
        for (int i = 0; i < 3; i++) {
            b.add(scanner.nextInt());
        }

        List<Integer> result = compareTriplets(a, b);
        System.out.println(result);

    }
}
