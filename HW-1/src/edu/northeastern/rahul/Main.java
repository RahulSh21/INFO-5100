package edu.northeastern.rahul;

import java.util.Arrays;
public class Main {

    public static void main(String[] args) {


        //Question 1
        int [] arr = {2,7,5,11,15};
        int trag = 9;
        sumTotal(arr,trag);

        //For Question 2
        int [] array = {-4,-1,0,3,10};

        squareAarry(array);
        bubbleSort(array);
        print(array);

        //for Question 3
        int arr1[] = { 2,3,4,2,2,4,3,3,5,5,7 };
        nonRepeating(arr1);



        //Question 4
        System.out.println(construct("aaab", "aaz"));



        //Question 5
        String ag = "G9e8e7k6s5f4a3r2f1";
        System.out.println("Lenght of string is " + ag.length());
        for(int i = 0; i < ag.length(); i++) {
            System.out.print(ag.charAt(i) + " ");
        }
        System.out.println();
        checkDig(ag);



    }//Main Class End


    //Question 1
    public static void sumTotal(int [] arr, int trag){
        for(int i = 1; i <= arr.length-1; i++){
            if((arr[0] + arr[i])/ trag == 1 ){
                System.out.println("num "+ arr[0] + " & " +arr[i] + " is " + trag );
                return;
            }
            else
            if(i >= arr.length-1)
                System.out.println("sum no. not present");
        }
    }


    //Question 2
    private static void squareAarry(int[] array){
        for( int i = 0; i < array.length; i++){
            array[i] = array[i] * array[i];
        }// For Array squaring End
    }
    private static void bubbleSort(int[] array){
        for(int i = 0 ; i < array.length ; i ++){
            for(int j = 0 ; j < array.length - i - 1; j ++){
                if(array[j] > array[j + 1] ){
                    int k = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = k;
                }
            }
        }
    }
    private static void print(int [] arr){
        System.out.println("Output :");
        for (int i = 0; i<arr.length; i++){
            System.out.print(" "+ arr[i]);
        }//Print Function
    }


    //Question 3
    private static void  nonRepeating(int arr[])
    {
        for (int i = 0; i < arr.length ; i++) {
            int j;
            for (j = 0; j <= arr.length; j++) {
                if (j == arr.length)
                {
                    System.out.println("First non-repeating element is: "+arr[i]);
                    return;
                }
                if (j != i && arr[i] == arr[j])
                {
                    break;
                }
            }
        }
        System.out.println("No Output found of non Reapeater ");
    }//End of nonRepeating function

    //Question 4

    public static boolean construct(String ransomNote, String magazine) {
        System.out.println("Output is ");
        if (ransomNote.length() < magazine.length()) {
            return false;
        }
        boolean flag = false;
        boolean visited[] = new boolean[ransomNote.length()];
        Arrays.fill(visited, Boolean.FALSE);
        for (int i = 0; i < magazine.length(); i++) {
            flag = false;
            for (int j = 0; j < ransomNote.length(); j++) {
                if (magazine.charAt(i) == ransomNote.charAt(j) && !visited[j]) {
                    visited[j] = true;
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }
    //Question 5
    private static void checkDig(String ag) {
        for (int i = 0; i <= ag.length() - 1; i++) {
            int a = ag.charAt(i);
            char b = ag.charAt(i + 1);
            if (a >= 65 && a <= 122 && b >= '0' && b <= '9') {
                i += 1;
            } else {
                System.out.println("Result is false");
                return;
            }
        }
        System.out.println("Result is True");
    }


}//End of Class
