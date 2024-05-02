package algorithms.dynamicProgramming.knapsack.topDown;

import java.util.Arrays;

public class Knapsack {

    /*
    *   j   0   1   2   3   4
    * i
    * 0     0   0   0   0   0
    * 1     0   0   0   0   0
    * 2     0   2   2   2   2
    * 3     0   2   3   5   5
    * 4     0   2   3   5   6
    * 5     0   2   3   5   6
    *
    * opt1 = 2 + 2
    * opt2 = 6
    * */

    static int[][] t;
    public static void main(String[] args) {
        int n = 5;
        int w = 4;
        int[] profit = new int[]{1,2,3,1,2};
        int[] wt = new int[]{5,1,2,1,3};
        t = new int[n+1][w+1];
        initialize(t,profit,wt);
        int maxProfit = t[n][w];
        printArray(t);
        System.out.println("maxProfit = " + maxProfit);
    }

    private static void printArray(int[][] t) {
        for(int i = 0; i < t.length; i++){
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void initialize(int[][] t, int[] profit, int[] wt) {
        for(int i = 0; i < t.length; i++){
            for (int j = 0; j < t[i].length; j++) {
                if(i == 0 || j == 0){
                    t[i][j] = 0;
                }else{
                    if(wt[i-1] > j){
                        t[i][j] = t[i-1][j];
                    }else{
                        int opt1 = profit[i-1] + t[i-1][j-wt[i-1]];
                        int opt2 = t[i-1][j];
                        t[i][j] = Math.max(opt1, opt2);
                    }
                }
            }
        }
    }

}
