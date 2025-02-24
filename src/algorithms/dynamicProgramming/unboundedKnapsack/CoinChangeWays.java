package algorithms.dynamicProgramming.unboundedKnapsack;

public class CoinChangeWays {
    /*
    * Given a list of coin change and a sum
    * find the number of ways to get the sum
    *
    * input: {1,2,3}, sum = 5
    * output: 5
    * */

    public static void main(String[] args) {
        int coins[] = new int[]{1,2,3};
        int sum = 5;
        int ways = coinChangeWays(coins.length, sum, coins);
        System.out.println("ways = " + ways);
    }

    private static int coinChangeWays(int n, int sum, int[] coins) {
        if(sum == 0){
            return 1;
        }else{
            if(n == 0){
                return 0;
            }
            else if(coins[n-1] > sum){
                return coinChangeWays(n-1, sum, coins);
            }else{
                int opt1 = coinChangeWays(n, sum-coins[n-1], coins);
                int opt2 = coinChangeWays(n-1, sum, coins);
                return opt1 + opt2;
            }
        }
    }
}
