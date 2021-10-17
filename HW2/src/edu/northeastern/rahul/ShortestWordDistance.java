package edu.northeastern.rahul;

public class ShortestWordDistance {
    //Function to calculate the minimum
    //Distance between word1 and word2 in wordsDict
    public static int shortWordDistance(String[] words , String word1, String word2){
        int index1 = -1, index2 = -1;
        int minDistance = words.length;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                index1 = i;
            } else if (words[i].equals(word2)) {
                index2 = i;
            }

            if (index1 != -1 && index2 != -1) {
                minDistance = Math.min(minDistance, Math.abs(index1 - index2));
            }
        }
        return minDistance;
    }//end of shortestWordDistance function
}

