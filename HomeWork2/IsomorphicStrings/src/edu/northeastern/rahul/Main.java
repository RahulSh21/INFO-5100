package edu.northeastern.rahul;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // Question 6 LeetCode: Isomorphic Strings
        //All function are define in different class called IsomorphicStrings
        System.out.println("\n LeetCode Question 6 Output ");
        boolean result = isIsomorphic("egg", "add");
        System.out.println("\n Given string Isomorphic condition is : " + result);
        boolean result1 = isIsomorphic("foo", "bar");
        System.out.println("\n Given string Isomorphic condition is : " + result1);
    }
    public static boolean isIsomorphic(String s, String t){

        if (s == null || t == null) {
            return false;
        }
        // using mapping to from characters of string 's' to string 't'
        Map<Character, Character> map = new HashMap<>();
        // use set to store a pool of already mapped characters
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++)
        {
            char x = s.charAt(i), y = t.charAt(i);
            // if `x` is seen before
            if (map.containsKey(x))
            {
                // return false if the first occurrence of `x` is mapped to a
                // different character
                if (map.get(x) != y) {
                    return false;
                }
            }
            // if it isn't mapped yet)
            else {
                // return false if `y` is already mapped to another char in 's'
                if (set.contains(y)) {
                    return false;
                }
                // map `t` to `s` and mark it as mapped
                map.put(x, y);
                set.add(y);
            }
        }
        return true;
    }
}
