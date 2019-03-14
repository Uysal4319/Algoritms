import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class GradingStudents {

    /*
     * Complete the gradingStudents function below.
     */
    static int[] gradingStudents(int[] grades) {
        for (int i = 0 ; i< grades.length;i++){
            if(grades[i] % 5 > 2 && !(grades[i]<38)){
                grades[i]=grades[i] + (5-(grades[i] % 5));
            }
        }
        return grades;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //example input -4 3 -9 0 4 1
        int[] arr=new int[4];

        for (int i = 0; i < 4; i++) {
            arr[i] = scan.nextInt();
        }
        int[] ar= gradingStudents(arr);
        for (int i = 0; i <ar.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}

