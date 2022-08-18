package HackerRank;

import java.util.ArrayList;

public class ComparingArrays {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1); a.add(2); a.add(3);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(3); b.add(2); b.add(1);

        int aScore = 0;
        int bScore =0;
        for (int i = 0; i <a.size() ; i++) {
            if(a.get(i)>b.get(i)){
                aScore++;
            }else if(b.get(i)>a.get(i)){
                bScore++;
            }else {
            }
        }
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(aScore);
        scores.add(bScore);
        for (int i = 0; i <scores.size() ; i++) {
            System.out.println(scores.get(i)+"  ");
        }



    }
}
