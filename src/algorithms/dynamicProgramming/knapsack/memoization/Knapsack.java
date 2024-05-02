package algorithms.dynamicProgramming.knapsack.memoization;

import java.util.Arrays;

public class Knapsack {

    static int[][] t;
    public static void main(String[] args) {
        int n = 5;
        int w = 4;
        int[] profit = new int[]{1,2,3,1,2};
        int[] wt = new int[]{5,1,2,1,3};
        t = new int[n+1][w+1];
        for (int i = 0; i < n+1; i++) {
            Arrays.fill(t[i], -1);
        }
        int maxProfit = knapsack(n, w, profit, wt);
        System.out.println("maxProfit = " + maxProfit);
    }

    private static int knapsack(int n, int w, int[] profit, int[] wt) {
        if(t[n][w] == -1){
            if(n == 0 || w == 0){
                t[n][w] = 0;
            }else{
                if(wt[n-1] > w){
                    t[n][w] =  knapsack(n-1, w, profit, wt);
                }else{
                    int opt1 = profit[n-1] + knapsack(n-1, w-wt[n-1], profit, wt);
                    int opt2 = knapsack(n-1, w, profit, wt);
                    t[n][w] = Math.max(opt1, opt2);
                    System.out.println("t["+n+"]["+w+"] = " + t[n][w]);
                }
            }
        }
        return t[n][w];
    }
}
