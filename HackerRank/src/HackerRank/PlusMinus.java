package HackerRank;

import java.util.ArrayList;

public class PlusMinus {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(-4);
        arr.add(3);
        arr.add(-9);
        arr.add(0);
        arr.add(4);
        arr.add(1);
        int zeros= 0;
        int positive=0;
        int negative =0;
        for(int i =0; i<arr.size(); i++){
            int num =arr.get(i);
            if(num==0){
                zeros++;
            }
            if(num>0){
                positive++;
            }
            if(num<0){
                negative++;
            }
        }
        int size = arr.size();
        double zeroResult =(double) zeros/size;
        double positiveResult =(double) positive/size;
        double negativeResult =(double) negative/size;

        System.out.printf("%.6f",zeroResult);
        System.out.printf("%.6f",positiveResult);
        System.out.printf("%.6f",negativeResult);

    }
}
