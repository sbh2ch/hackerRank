package hacker01.q4;

import java.util.Scanner;

public class RepeatedString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        long tries = n / s.length();
        long some = n % s.length();

        long cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a')
                cnt++;
        }

        cnt *= tries;
        for (int i = 0; i < some; i++) {
            if (s.charAt(i) == 'a')
                cnt++;
        }

        System.out.println((cnt));
    }
}
