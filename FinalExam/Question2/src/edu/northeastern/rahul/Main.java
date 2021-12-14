package edu.northeastern.rahul;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagram(strs));

    }

    public static List<List<String>> groupAnagram(String[] intputArray){
        Map<String, List<String>> groupAnagram = new HashMap<>();
        for(String inputString : intputArray){
            char[] charArray = inputString.toCharArray();
            Arrays.sort(charArray);
            String sortString = String.valueOf(charArray);
            if(!groupAnagram.containsKey(sortString)){
                groupAnagram.put(sortString, new ArrayList<>());
            }
            groupAnagram.get(sortString).add(inputString);
        }
        return new ArrayList<>(groupAnagram.values());
    }
}
