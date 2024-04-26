package algorithms.dynamicProgramming.fibonacci.topDown;

import java.util.Arrays;

public class Fibonacci {

    /*
    * Recursive
    * 1-> 1
    * 2-> 1
    * 3 -> fib(2) + fib(1) -> 1 + 1 = 2
    * 5 -> fib(4) + fib(3) -> fib(3) + fib(2) +fib(2) + fib(1)
    *
    * Memoization
    * store it a data structure
    *
    * Top Down
    * Calculate everything in beginning then just return what is found in the array
    * */

    static int[] t;

    public static void main(String[] args) {
        int n = 7;
        t = new int[n+1];
        Arrays.fill(t, -1);
        initializeTopDown(t);
        System.out.println("result = " + t[n]);
    }

    private static void initializeTopDown(int[] t) {
        t[1] = 1;
        t[2] = 1;
        for(int i=3; i<t.length; i++){
            t[i] = t[i-1] + t[i-2];
        }
    }
}
