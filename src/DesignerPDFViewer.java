import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DesignerPDFViewer {

    // Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] h, String word) {
        Map<Character, Integer> couple = new HashMap<>();
        int j = 0;
        int max = 0;
        for (int i = 97; i <= 122; i++, j++) {
            couple.put((char)i, h[j]);
        }
        for (int i = 0; i < word.length(); i++) {
            if (couple.get(word.charAt(i))>max) {
                max = couple.get(word.charAt(i));
            }
        }
        return max*word.length();
    }

    private static final Scanner    scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[] h = new int[]{1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7};


        String word = scanner.nextLine();

        int result = designerPdfViewer(h, word);
        System.out.println(result);
        scanner.close();
    }
}
