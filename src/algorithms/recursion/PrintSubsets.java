package algorithms.recursion;

public class PrintSubsets {
    /*
    * Given a string print all subsets
    * input: "AB"
    * output: "", "A", "B", "AB"
    * */

    public static void main(String[] args) {
        printAllSubsets("AB", "");
    }

    private static void printAllSubsets(String input, String output) {
        if(input.isEmpty()){
            System.out.println(output);
        }else{
            printAllSubsets(input.substring(1), output);
            printAllSubsets(input.substring(1), output + input.charAt(0));
        }
    }
}
