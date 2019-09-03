import java.util.Scanner;

public class AppendAndDelete {

    // Complete the appendAndDelete function below.
    static String appendAndDelete(String s, String t, int k) {
        int sameCharacter = 0;
        int deleteCount = 0;
        int addCount = 0;
        if(s.length()<t.length()){
            for(int i = 0 ;i <t.length();i++){
                if(!s.contains(String.valueOf(t.charAt(i)))){
                   return "No";
                }
            }
            return "Yes";
        }

        if (s.equals(t)) {
            return "Yes";
        }

        for (int i = t.length(); i != 0; i--) {

            String substring =t.substring(0,i);
            if (s.contains(substring)) {
                sameCharacter = i;
                break;
            }
        }

        deleteCount = s.length() - sameCharacter;
        addCount = t.length() - sameCharacter;

        if ((deleteCount + addCount) <= k) {
            return "Yes";
        } else {
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
