package edu.northeastern.rahul;

import java.util.Arrays;
public class Main {

    public static void main(String[] args) {

        //Question 1
        int [] arr = {2,7,5,11,15};
        int trag = 9;
        sumTotal(arr,trag);// calling for sunTotal function

        //Question 2
        int [] array = {-4,-1,0,3,10};
        squareArray(array); //calling for squareArray function
        bubbleSort(array); //calling for bubbleSort function
        print(array); //calling for print function

        //Question 3
        int arr1[] = { 2,3,4,2,2,4,3,3,5,5,7 };
        nonRepeating(arr1);// calling for nonRepeating funtion

        //Question 4
        System.out.println(construct("aaab", "aaz"));//calling for construct function

        //Question 5
        String ag = "1A3d4s5t";
        System.out.println("Lenght of string is " + ag.length());
        checkDig(ag);//calling for checkDig function

    }//Main Class End

    //Question 1
    public static void sumTotal(int [] arr, int trag){
        for(int i = 1; i <= arr.length-1; i++){
            if((arr[0] + arr[i])/ trag == 1 ){
                System.out.println("num "+ arr[0] + " & " +arr[i] + " is " + trag );
                return;
            }//End of if statement
            else
            if(i >= arr.length-1) {
                System.out.println("sum no. not present");
            }//End of if statement
        }//End of for loop int i
    }//End sumTotal function --> End of Question 1

    //Question 2
    private static void squareArray(int[] array){
        for( int i = 0; i < array.length; i++){
            array[i] = array[i] * array[i];
        }//End of for loop int i
    }//End of squareArray function

    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int k = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = k;
                }//End of if statement
            }//End of for loop int j
        }//End of for loop int i
    }//End of bubbleSort function

    private static void print(int [] arr){
        System.out.println("Output :");
        for (int i = 0; i<arr.length; i++){
            System.out.print(" "+ arr[i]);
        }//End of for loop int i
    }//End of print Function --> End of Question 2

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
                }//End of if statement
                if (j != i && arr[i] == arr[j])
                {
                    break;
                }//End of if statement
            }//End of for loop int j
        }//End of for loop int i
        System.out.println("No Output found of non Reapeater ");
    }//End nonRepeating function --> End of Question 3

    //Question 4
    public static boolean construct(String ransomNote, String magazine) {
        System.out.println("Output is ");
        if (ransomNote.length() < magazine.length()) {
            //Compairing the lenght of ransomNote & magazine
            return false;
        }//End of if statement

        boolean flag = false;
        boolean visited[] = new boolean[ransomNote.length()];//Creating Array of type boolean
        Arrays.fill(visited, Boolean.FALSE);//Assigning false value to boolean array element
        for (int i = 0; i < magazine.length(); i++) {
            flag = false;
            for (int j = 0; j < ransomNote.length(); j++) {
                if (magazine.charAt(i) == ransomNote.charAt(j) && !visited[j]) {
                    visited[j] = true;
                    flag = true;
                    break;
                }//End of if statement
            }//End for ransomeNote for loop
        }//End for magaine for loop
        return flag;
    }//End construct function --> End of Question 4

    //Question 5
    private static void checkDig(String ag) {
        for (int i = 0; i <= ag.length() - 1; i++) {
            int a = ag.charAt(i);//Getting ASCII value of alphabet
            char b = ag.charAt(i + 1);//Getting digit
            if (a >= 65 && a <= 122 && b >= '0' && b <= '9') {
                i += 1;
            } else {
                System.out.println("Result is false");
                return;
            }//End of else statement
        }//End of for loop int i
        System.out.println("Result is True");
    }//End of checkDig function --> End of Question 5

}//End of class main
