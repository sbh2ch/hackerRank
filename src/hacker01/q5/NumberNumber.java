package hacker01.q5;

import java.util.*;

public class NumberNumber {
    public static void main(String[] args) {
        String[] s = new Scanner(System.in)
                .nextLine()
                .split(" ");

        Arrays.sort(s, new Compare());

        String min = "";
        String max = "";

        for (int i = s.length - 1; i >= 0; i--)
            max += s[i];

        for (int i = 0; i < s.length; i++)
            min += s[i];

        System.out.println(Integer.parseInt(max) + Integer.parseInt(min));
    }
}

class Compare implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        o1 = o1.length() == 1 ? o1 + o1 : o1;
        o2 = o2.length() == 1 ? o2 + o2 : o2;

        return Integer.parseInt(o1) - Integer.parseInt(o2);
    }
}