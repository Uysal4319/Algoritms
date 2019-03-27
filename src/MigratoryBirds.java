import java.io.IOException;
import java.util.*;

public class MigratoryBirds {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int most = 0;
        int max = 0;

        for (Integer i : arr) {

            map.merge(i, 1, Integer::sum);

        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                most = entry.getKey();
                max =    entry.getValue();
            }
        }

        return most;
    }

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        List<Integer> arr = new ArrayList<>();

        int arrCount = scanner.nextInt();

        for (int i = 0; i < arrCount; i++) {
            arr.add(scanner.nextInt());
        }

        int result = migratoryBirds(arr);

        System.out.println(result);
    }
}
