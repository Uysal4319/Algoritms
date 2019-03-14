import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        if(s.contains("AM")){
            String [] hour = s.split(":");
            StringBuilder sb = new StringBuilder();
            if(Integer.parseInt(hour[0])>=12){
                int temp = Integer.parseInt(hour[0])-12;
                if(temp<10){
                    sb.append("0"+temp);
                }
            }else {
                sb.append(hour[0]);
            }
            sb.append(":").append(hour[1]).append(":").append(hour[2]);
            return sb.toString().substring(0,sb.length()-2);
        }else if (s.contains("PM")){
            String [] hour = s.split(":");
            StringBuilder sb = new StringBuilder();
            if(Integer.parseInt(hour[0])<12){
                int temp = Integer.parseInt(hour[0])+12;

                    sb.append(temp);

            }else {

                sb.append(hour[0]);
            }
            sb.append(":").append(hour[1]).append(":").append(hour[2]);
            return sb.toString().substring(0,sb.length()-2);
        }else return s+" Wrong Time Format";
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        System.out.println(timeConversion("12:05:45PM"));

    }
}
