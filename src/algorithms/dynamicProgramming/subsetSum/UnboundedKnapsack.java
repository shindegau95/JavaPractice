package algorithms.dynamicProgramming.subsetSum;

public class UnboundedKnapsack {
    public static void main(String[] args) {
        int n = 5;
        int w = 4;
        int[] profit = new int[]{1,2,3,1,2};
        int[] wt = new int[]{5,1,2,1,3};
        int maxProfit = knapsack(n, w, profit, wt);
        System.out.println("maxProfit = " + maxProfit);
    }

    private static int knapsack(int n, int w, int[] profit, int[] wt) {
        if(n == 0 || w == 0){
            return 0;
        }else{
            if(wt[n-1] < w){
                int opt1 = knapsack(n-1, w, profit, wt);
                int opt2 = profit[n-1] + knapsack(n-1, w, profit, wt);
                return Math.max(opt1, opt2);
            }else{
                return knapsack(n-1, w, profit, wt);
            }
        }
    }
}
