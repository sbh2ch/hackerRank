package hacker02.q2;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            map.put(sc.nextLine(), 1);
        }
        for (int i = 0; i < m; i++) {
            String name = sc.nextLine();
            if (map.containsKey(name)) {
                map.put(name, map.get(name) + 1);
            }
        }

        ArrayList<String> list = new ArrayList<>();

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() == 2) {
                list.add(e.getKey());
            }
        }

        System.out.println(list.size());
        for (String e : list) {
            System.out.println(e);
        }
    }
}
