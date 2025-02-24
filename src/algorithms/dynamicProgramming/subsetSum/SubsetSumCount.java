package algorithms.dynamicProgramming.subsetSum;

public class SubsetSumCount {

    /*
    * Given an array and sum, count the number of subsets whose sum is as given
    * input: [2,3,5,6,8,10]
    * sum: 10
    * output: 3
    * */

    public static void main(String[] args) {
        int[] arr = {2,3,5,6,8,10};
        int sum = 10;
        int count = countSubsetSum(arr.length, arr, sum);
        System.out.println("count = " + count);
    }

    private static int countSubsetSum(int length, int[] arr, int sum) {
        if(sum == 0){
            return 1;
        }
        if(length == 0){
            return 0;
        }
        else{
            int opt1 = countSubsetSum(length-1, arr, sum);
            int opt2 = countSubsetSum(length-1, arr, sum-arr[length-1]);
            return opt1 + opt2;
        }
    }
}
