package algorithms.dynamicProgramming.unboundedKnapsack;

import java.util.stream.IntStream;

public class RodCutting {

    /*
     * Given a rod of length l, cut the rod such that the profit is max
     * input: l = 8, price = {1,5,8,9,10,17,17,20}
     * */

    public static void main(String[] args) {
        int price[] = {1, 5, 8, 9, 10, 17, 17, 20};
        int l = 8;
        int length[] = IntStream.rangeClosed(1, l).toArray();
        int profit = cutRod(l, l, price, length);
        System.out.println("profit = " + profit);
    }

    private static int cutRod(int n, int l, int[] price, int[] length) {
        if (n == 0 || l == 0){
            return 0;
        }
        if(length[n-1] > l){
            return cutRod(n-1, l, price, length);
        }else{
            int opt1 = price[n-1] + cutRod(n, l-length[n-1], price, length);
            int opt2 = cutRod(n-1, l, price, length);
            return Math.max(opt1, opt2);
        }
    }
}
