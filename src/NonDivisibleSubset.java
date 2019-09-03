import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NonDivisibleSubset {
    public static int nonDivisibleSubset(int k, List<Integer> s) {




    return k;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int listSize= scanner.nextInt();
        int k = scanner.nextInt();


        List<Integer> list = new ArrayList<>();

        for (int i =0 ; i< listSize ;i++){
            list.add(scanner.nextInt());
        }

        nonDivisibleSubset(k,list);

    }
}
