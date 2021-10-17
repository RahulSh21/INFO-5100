package edu.northeastern.rahul;

public class Main {

    public static void main(String[] args) {
        // Question 10 LeetCode: String Compression
        //All function are define in different class called StringCompression
        System.out.println("LeetCode Question 10 Output ");

        char chars[] = {'a', 'b', 'a', 'b','b','b','b', 'c', 'c', 'c', 'q','q','q','q','q','q'};
        int lengthOfChars = stringCompression(chars);
        System.out.println("Length of compressed string = " + lengthOfChars );
    }
    static int stringCompression(char[] arr){
        char lastChar = arr[0];
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for(int i = 1; i < arr.length; i ++){
            // If the last char is same as the previous then just increment count\
            // otherwise check if count == 1 in that case just get last char
            // else add last char and 1
            if(arr[i] == lastChar){
                count++;
            }else{
                if(count == 1){
                    sb.append(lastChar);
                }else{

                    sb.append( Character.toString(lastChar) + count );
                    count =1;
                }
            }
            lastChar = arr[i];
        }

        if(count == 1){
            sb.append(lastChar);
        }else{
            sb.append(Character.toString(lastChar) + count );
        }
        System.out.println("Compressed String = " + sb.toString() );
        return  sb.toString().length();
    }
}

