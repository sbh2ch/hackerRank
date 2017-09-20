package hacker01.q2;

import java.util.Scanner;

public class GradingStudents {
    static int[] solve(int[] grades) {
        // Complete this function
        int diff;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= 38) {
                diff = 5 - (grades[i] % 5);
                grades[i] = (diff == 1 || diff == 2) ? grades[i] + diff : grades[i];
            }
        }

        return grades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for (int grades_i = 0; grades_i < n; grades_i++) {
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
    }
}
