import java.util.Scanner;

public class AppendAndDelete {

    // Complete the appendAndDelete function below.
    static String appendAndDelete(String s, String t, int k) {
        int sameCharacter = 0;
        int deleteCount = 0;
        int addCount = 0;
        if (t.length() < k) {
            return "No";
        }

        if (s.equals(t)) {
            return "Yes";
        }

        for (int i = t.length() - 1; i == 0; i--) {
            if (s.contains(t.substring(i))) {
                sameCharacter = i;
                break;
            }
        }

        deleteCount = s.length() - sameCharacter;
        addCount = t.length() - sameCharacter;

        if((deleteCount+addCount)<=k){
            return "Yes";
        }else {
            return "No";
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        String t = scanner.nextLine();

        int k = scanner.nextInt();

        System.out.println(appendAndDelete(s, t, k));
    }

}
