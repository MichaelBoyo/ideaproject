package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

        arr.add(256741038);
        arr.add(623958417);
        arr.add(467905213);
        arr.add(714532089);
        arr.add(938071625);
        long ex1 = 0;
        long ex2 = 0;
        long ex3 = 0;
        long ex4 = 0;
        long ex5 = 0;
        List<Long> sums = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (i != 0) {
                ex1 += arr.get(i);
            }
            if (i != 1) {
                ex2 += arr.get(i);
            }
            if (i != 2) {
                ex3 += arr.get(i);
            }
            if (i != 3) {
                ex4 += arr.get(i);
            }
            if (i != 4) {
                ex5 += arr.get(i);
            }

        }

        sums.add(ex1);
        sums.add(ex2);
        sums.add(ex3);
        sums.add(ex4);
        sums.add(ex5);

        long min = ex1;
        long max = ex1;
        for (Long sum : sums) {
            if (sum > max) {
                max = sum;
            }
            if (sum < min) {
                min = sum;
            }
        }
        System.out.print(min + " " + max);
    }
}