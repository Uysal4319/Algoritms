import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PickingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("liste kac elemanli olsun");
        List<Integer> list = new ArrayList();
        int n = scanner.nextInt();

        System.out.println("listeye eklenecek elemanlari girin");
        for(int i = 0 ;i< n ;i++){
            list.add(scanner.nextInt());
        }

        System.out.println(pickingNumbers(list));
    }

    public static int pickingNumbers(List<Integer> a) {
        List<List<Integer>> subLists  = new ArrayList<>();
        List<Integer> sublist = new ArrayList<>();

        for (int i =0 ; i<a.size();i++){


        }




    return subLists.size();
    }

}
