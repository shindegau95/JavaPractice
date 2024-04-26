package algorithms.dynamicProgramming.fibonacci.recursive;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 7;
        int result = fibonacci(n);
        System.out.println("result = " + result);
    }

    private static int fibonacci(int n) {
        if(n == 1 || n == 2){
            return 1;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
