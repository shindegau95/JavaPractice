package algorithms.general;

import java.util.HashMap;
import java.util.Map;

public class RomantoInteger {
    public static void main(String[] args) {
        RomantoInteger romantoInteger = new RomantoInteger();
        int result = romantoInteger.romanToInt("MCMXCIV");
        System.out.println("result = " + result);
    }
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int n = 0;
        for(int i =0; i<s.length(); i++){
            char c = s.charAt(i);
            if(i < s.length() - 1){
                char next = s.charAt(i+1);
                if(map.get(c) < map.get(next)){
                    n = n - map.get(c);
                    continue;
                }
            }
            n += map.get(c);
        }
        return n;
    }
}
