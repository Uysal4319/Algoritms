import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CutTheSticks {
// TODO yapilacak
    static int[] cutTheSticks(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int res = 0;

        int small = Integer.MAX_VALUE;
        int count = arr.length;
        while (count > 0) {

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] != 0) {
                    if (small > arr[i]) {
                        small = arr[i];
                    }
                } else {
                    count--;
                }
            }

            for (int i = 0; i < arr.length; i++){
                if(arr[i]!=0){
                    arr[i] = arr[i] - small;
                    res++;
                }
            }
            list.add(res);
            res =0;
            small = Integer.MAX_VALUE;
        }

        int[] result = new int[list.size()];
        int index =0;
      for(Integer i : list){
          result[index] = i;
      }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();

        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }
        int[] result = cutTheSticks(array);

        for (int i = 0; i < result.length; i++) {

            System.out.println(result[i]);
        }
    }
}
