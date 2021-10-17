package edu.northeastern.rahul;

public class MoveZero {
    private  void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

    }
    public void moveZerosToEnd(int[] arr){
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
    public void printMoveZero(int[] nums){
        for(int i = 0; i<nums.length; i++){
            System.out.print(" " + nums[i]);
        }
    }
}
