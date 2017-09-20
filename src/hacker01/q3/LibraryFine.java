package hacker01.q3;

import java.text.ParseException;
import java.util.Scanner;

public class LibraryFine {
    static class FineCalculator {
        private int result = 0;
        int[] expected, actual;

        public void calc() throws ParseException {
            if (expected[2] != actual[2]) {
                result = (expected[2] < actual[2]) ? 10000 : 0;
            } else if (expected[1] != actual[1]) {
                result = (expected[1] < actual[1]) ? 500 * (actual[1] - expected[1]) : 0;
            } else if (expected[0] != actual[0]) {
                result = (expected[0] < actual[0]) ? 15 * (actual[0] - expected[0]) : 0;
            }
        }

        public void setCalculator(int[] actual, int[] expected) {
            this.actual = actual;
            this.expected = expected;
        }

        public int getResult() {
            return result;
        }

    }

    public static void main(String[] args) throws ParseException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int d1 = sc.nextInt();
        int m1 = sc.nextInt();
        int y1 = sc.nextInt();
        int d2 = sc.nextInt();
        int m2 = sc.nextInt();
        int y2 = sc.nextInt();

        FineCalculator fineCalculator = new LibraryFine.FineCalculator();
        fineCalculator.setCalculator(new int[]{d1, m1, y1}, new int[]{d2, m2, y2});
        fineCalculator.calc();

        System.out.println(fineCalculator.getResult());
    }
}
