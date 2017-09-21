package hacker02.q1;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++)
            set.add(sc.nextInt());

        int m = sc.nextInt();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < m; i++) {
            result.append(set.contains(sc.nextInt()) ? "1" : "0");
            result.append(i == m - 1 ? "" : " ");
        }

        System.out.println(result);
    }
}
