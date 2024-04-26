package algorithms.dynamicProgramming.fibonacci.memoization;

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
    * */

    static int[] t;

    public static void main(String[] args) {
        int n = 7;
        t = new int[n+1];
        Arrays.fill(t, -1);
        int result = fibonacci(n);
        System.out.println("result = " + result);
    }

    private static int fibonacci(int n) {
        if(t[n] != -1){
            return t[n];
        }
        if(n == 1 || n == 2){
            t[n] = 1;
        }else{
            t[n] = fibonacci(n-1) + fibonacci(n-2);
        }

        return t[n];
    }
}
