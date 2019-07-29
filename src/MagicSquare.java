import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MagicSquare {

    static int formingMagicSquare(int[][] s) {
        int result = 0;
        List<Integer> duplicate = new ArrayList<>();
        List<Integer> lack = new ArrayList<>();
        Map<Integer,Integer> map =new HashMap<Integer, Integer>();
        for (int i=1 ;i<10;i++){
            map.put(i,0);
        }

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                int key =  s[i][j];

                map.merge(key,1, Integer::sum);
            }
        }

        for(Map.Entry entrySet : map.entrySet()){
            int value = (int) entrySet.getValue();
            if(value==0){
                int key = (int) entrySet.getKey();
                lack.add(key);
            } else if(value >1){
                int key = (int) entrySet.getKey();
                duplicate.add(key);
            }
        }
        for(int i = 0 ;i< lack.size();i++){
            result = result + Math.abs((lack.get(i)-duplicate.get(i)));
        }


    return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

//        int[][] s = new int[3][3];
//
//        for (int i = 0; i < 3; i++) {
//
//            for (int j = 0; j < 3; j++) {
//                int sItem = scanner.nextInt();
//                s[i][j] = sItem;
//            }
//        }
//
//        int result = formingMagicSquare(s);
//


        Scanner scanners = new Scanner(System.in);
        int[][] m = new int[3][3];
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                m[x][y] = scanners.nextInt();
            }
        }
        int[][][] p = {{{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
                {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
                {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
                {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
                {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
                {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
                {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}},
                {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}}};
        int min = 100;
        for (int i = 0; i < 8; i++) {
            int diff = 0;
            for (int x = 0; x < 3; x++) {
                for (int y = 0; y < 3; y++) {
                    diff += Math.abs(p[i][x][y] - m[x][y]);
                }
            }
            if (diff < min)
                min = diff;
        }
        System.out.println(min);
        scanners.close();
    }
}
