package algorithms.dynamicProgramming.subsetSum;

import java.util.stream.IntStream;

public class EqualSumPartition {
    /*
     * Given an array of ints, find if it is possible to subset the array such that sum of both subsets is equal
     * inupt: {1,5,5,11}
     * output: 11
     *
     *
     *
     * Solution: if there exists such scenario then the sum of all numbers in the array will be 2S i.e. it will be even
     * inorder to solve this, we have to check if there exists a subset with s or no
     * */

    public static void main(String[] args) {
        int[] arr = {1, 5, 5, 8};
        int sum1 = IntStream.of(arr).sum();
        if(sum1 %2==0){
            int sum = sum1 / 2;
            boolean equalPartition = isEqualPartition(arr.length, arr, sum);
            System.out.println("equalPartition = " + equalPartition);
        }
        else{
            System.out.println(false);
        }
    }

    private static boolean isEqualPartition(int length, int[] arr, int sum) {
        if (sum == 0) {
            return true;
        }
        if (length == 0) {
            return false;
        } else {
            boolean opt1 = isEqualPartition(length - 1, arr, sum);
            boolean opt2 = isEqualPartition(length - 1, arr, sum - arr[length - 1]);
            return opt1 || opt2;
        }
    }
}
