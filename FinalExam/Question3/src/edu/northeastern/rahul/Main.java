package edu.northeastern.rahul;

public class Main {

    public static void main(String[] args) {
	int[] nums = {1,2,3};
    int k = 3;
        System.out.println(totalContinousArray(nums,k));
    }

    public static int totalContinousArray(int[] nums, int k){


        int count = 0;
        for(int i = 0; i < nums.length ; i++ ){
            int check = k - nums[i];
            if(check == 0 || check == nums[i+1] ){
                count++;
            }
        }
        return count;
    }
}
