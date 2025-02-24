package algorithms.dynamicProgramming.unboundedKnapsack;

public class CoinChangeMinNumber {
    /*
     * Given a list of coin change and a sum
     * find the number of coins to get the sum
     *
     * input: {1,2,3}, sum = 5
     * output:
     * */

    public static void main(String[] args) {
        int coins[] = new int[]{1, 2, 3};
        int sum = 5;
        int ways = coinChangeMinNumber(coins.length, sum, coins);
        System.out.println("ways = " + ways);
    }

    private static int coinChangeMinNumber(int n, int sum, int[] coins) {
        if (sum == 0) {
            return 0;
        } else {
            if(n == 0){
                return Integer.MAX_VALUE - 1;
            }
            if(n == 1){
                if(sum % coins[n-1] == 0){
                    return sum/coins[n-1];
                }else{
                    return Integer.MAX_VALUE;
                }
            }
            if (coins[n - 1] > sum) {
                return coinChangeMinNumber(n - 1, sum, coins);
            } else {
                int opt1 = 1 + coinChangeMinNumber(n, sum - coins[n - 1], coins);
                int opt2 = coinChangeMinNumber(n - 1, sum, coins);
                return Math.min(opt1, opt2);
            }
        }
    }
}
