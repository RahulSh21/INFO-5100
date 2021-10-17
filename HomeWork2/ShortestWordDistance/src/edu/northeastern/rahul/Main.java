package edu.northeastern.rahul;

public class Main {

    public static void main(String[] args) {
        // Question 2 LeetCode: Shortest Word Distance
        //All function are define in different function called ShortestWordDistance
        System.out.println("LeetCode Question 2 Output ");
        String wordsDict[] ={"practice", "makes", "perfect", "coding", "makes"};
        String word1 = "makes";
        String word2 = "coding";
        int output = shortWordDistance(wordsDict, word1, word2);
        if (output > 0){
            System.out.println(" Shortest Word Distance is " + output);
        }else {
            System.out.println("Word not found");
        }
    }

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
