import java.util.*;

public class CutTheSticks {
    // TODO yapilacak
    static int[] cutTheSticks(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int res = 0;

        int small = Integer.MAX_VALUE;
        int count = arr.length;
        while (count > 0) {

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > 0) {
                    if (small > arr[i]) {
                        small = arr[i];
                    }
                } else {
                    count--;

                }
            }

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    arr[i] = arr[i] - small;
                    res++;
                }
            }
            list.add(res);
            res = 0;
            small = Integer.MAX_VALUE;
        }

        int[] result = new int[list.size()];
        int index = 0;

        for (Integer i : list) {
            result[index] = i;
            index++;
        }
        return result;
    }

    static int[] cutTheStick(int[] arr) {
        List<Integer> list = new ArrayList<>();
        List<Integer> resultList = new ArrayList<>();
        int res = 0;
        Integer min;
        int count = arr.length;

        for (int i = 1; i < arr.length; i++) {
            list.add(arr[i]);
        }

        while (list.size() > 0) {

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == 0) {
                    list.remove(i);
                }
            }
            IntSummaryStatistics stats = list.stream().mapToInt(x -> x).summaryStatistics();
            min = stats.getMin();

            for (int i = 0; i < list.size(); i++) {
                int element = list.get(i);
                list.set(i, element - min);
                if (list.get(i)<=0){
                    res++;
                }
            }

            resultList.add(res);

            res=0;
        }

        int[] result = new int[resultList.size()];

        for (int i = 0; i < resultList.size(); i++) {
          result[i] = resultList.get(i);
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
        int[] result = cutTheStick(array);

        for (int i = 0; i < result.length; i++) {

            System.out.println(result[i]);
        }
    }
}
