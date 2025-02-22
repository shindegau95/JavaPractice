package algorithms.recursion;

public class PrintUniqueSubsets {
    /*
    * Given a string print all subsets
    * input: "AB"
    * output: "", "A", "AA", "B", "AB", "AAB"
    * */

    public static void main(String[] args) {
        printAllSubsets("AAB", "");
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
