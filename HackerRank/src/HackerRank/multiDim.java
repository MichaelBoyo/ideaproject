package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class multiDim {
    public static void main(String[] args) {

        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        List<Integer> data = new ArrayList<>();
        List<Integer> data2 = new ArrayList<>();
        List<Integer> data3 = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            data.add(i * 2 + 3);
            data2.add(i * 5 - 4);
            data3.add(i * 8 - 9);
        }
        arr.add(data);
        arr.add(data2);
        arr.add(data3);
        for (List<Integer> integers : arr) {
            System.out.println(integers);
        }
    }
}
