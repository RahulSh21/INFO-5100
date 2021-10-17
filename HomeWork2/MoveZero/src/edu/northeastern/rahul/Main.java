package edu.northeastern.rahul;

public class Main {

    public static void main(String[] args) {
        // Question 3 LeetCode: Move Zero
        //All function are define in different function called MoveZero
        System.out.println("LeetCode Question 3 Output ");
        int nums[] ={0,1,0,3,1,2,0,0};
        printMoveZero(nums);
        moveZerosToEnd(nums);
        System.out.println("\n Output of Move zero: ");
        printMoveZero(nums);
        System.out.println();
    }

    private static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

    }
    public static void moveZerosToEnd(int[] arr){
        if(arr == null || arr.length == 1){
            return;
        }
        int current = 0;
        int zeroPointer = 0;

        while(current < arr.length){
            if(arr[current] != 0){
                swap(arr, current, zeroPointer);
                zeroPointer ++;
            }
            current++;
        }
    }
    public static void printMoveZero(int[] nums){
        for(int i = 0; i<nums.length; i++){
            System.out.print(" " + nums[i]);
        }
    }
}
