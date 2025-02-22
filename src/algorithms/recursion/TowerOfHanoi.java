package algorithms.recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 64;
        int source = 1, dest = 3, helper = 2;
        toh(n, source, dest, helper);
    }

    private static void toh(int n, int source, int dest, int helper) {
        if(n==1){
            System.out.println("Move " + n + " from " + source + " to " + dest);
        }else{
            toh(n-1, source, helper, dest);
            System.out.println("Move " + n + " from " + source + " to " + dest);
            toh(n-1, helper, dest, source);
        }
    }
}
