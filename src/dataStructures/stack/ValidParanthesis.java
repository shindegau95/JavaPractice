package dataStructures.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParanthesis {
    /*
     * Given an input string s consisting solely of the characters '(', ')', ', ', '[' and ']', determine whether s
     * is a valid string. A string is considered valid if every opening bracket is closed by a matching type of
     * bracket and in the correct order, and every closing bracket has a corresponding opening bracket of the same type.
     * */

    public static void main(String[] args) {
        String s = "(){({})}";

        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');

        Stack stack = new Stack();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)){
                if(stack.peek().equals(map.get(c))){
                    stack.pop();
                }
            }else{
                stack.push(c);
            }
        }

        if (stack.isEmpty()){
            System.out.println("Valid");
        }else {
            System.out.println("Invalid");
        }
    }
}
