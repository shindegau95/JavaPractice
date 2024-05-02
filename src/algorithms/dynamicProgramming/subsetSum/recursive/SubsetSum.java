package algorithms.dynamicProgramming.subsetSum.recursive;

public class SubsetSum {
    public static void main(String[] args) {
        int n = 6;
        int[] arr = new int[]{5,3,7,6,9,1};
        int target = 12;
        boolean result = subsetSum(n, arr, target);
        System.out.println("result = " + result);
    }

    private static boolean subsetSum(int n, int[] arr, int target) {
        if(target == 0){
            return true;
        }
        if(n == 0){
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr["+i+"] = " + arr[n-1]);
        }
        boolean opt1 = subsetSum(n-1, arr, target-arr[n-1]);
        boolean opt2 = subsetSum(n-1, arr, target);
        return opt1 || opt2;
//        return false;
    }
}
