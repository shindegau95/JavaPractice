package algorithms.general;

public class Kadane {

    /*
    * Given an array arr[], the task is to find the subarray that has the maximum sum and return its sum.
    * Input: arr[] = {2, 3, -8, 7, -1, 2, 3}
    * Output: 11
    * Explanation: The subarray {7, -1, 2, 3} has the largest sum 11.
    *  */

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 7, 8};
        int result = findMaxSubArray(arr);
        System.out.println("result = " + result);
    }

    private static int findMaxSubArray(int[] arr) {
        /*
        * the idea is to traverse the array from left to right
        * while traversing keep a record of the max sum till that point
        * to calculate max sum there are 2 options
        *
        * 1) sum of current element and sum till previous
        * 2) the current element
        *
        * the result will be the max of 1 & 2. However since we lose the result till now... we have global max to store the final result
        * */
        int globalMax = 0;
        int localMax = 0;
        for(int i: arr){
            localMax = Math.max(i + localMax, i);
            globalMax = Math.max(localMax, globalMax);
        }
        return globalMax;
    }
}
