import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SequenceEquation {

    // Complete the permutationEquation function below.
    static int[] permutationEquation(int[] p) {

        int[] result = new int[p.length];
        List<Integer> temp = new ArrayList<>();


        for (int i = 0; i < p.length; i++) {
            temp.add(p[p[i] - 1]);
        }

        for (int i = 0; i < p.length; i++) {
            result[i] = temp.indexOf(i + 1) + 1;
        }

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int arraySize = scanner.nextInt();

        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println(permutationEquation(array));

    }
}


/*
Complete the permutationEquation function in the editor below. It should return an array of integers that represent the values of y .

permutationEquation has the following parameter(s):

p: an array of integers


*/