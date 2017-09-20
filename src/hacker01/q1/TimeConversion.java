package hacker01.q1;

import java.util.Scanner;

public class TimeConversion {

    static String timeConversion(String s) {
        // Complete this function
        String[] dates = s.split(":");

        if (dates[2].endsWith("AM") && dates[0].equals("12"))
            dates[0] = "00";

        if (dates[2].endsWith("PM") && Integer.parseInt(dates[0]) < 12) {
            dates[0] = Integer.parseInt(dates[0]) + 12 + "";
        }

        return dates[0] + ":" + dates[1] + ":" + dates[2].substring(0, 2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
