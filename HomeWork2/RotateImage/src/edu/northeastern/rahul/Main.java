package edu.northeastern.rahul;

public class Main {

    public static void main(String[] args) {
        // Question4 LeetCode: Rotate Image
        //All function are define in different Function called RotateImage
        System.out.println("LeetCode Question 4 Output ");
        int rotateMatrix[][] = {{1,2,3} , {4,5,6} , {7,8,9}};
        System.out.println("Given Matrix is: ");
        printMatrix(rotateMatrix);
        rotateImage90(rotateMatrix);
        System.out.println("Matrix rotated by by 90 degrees: " );
        printMatrix(rotateMatrix);
    }

    public static void rotateImage90(int matrix[][]){
        if(matrix.length == 0){
            return;
        }
        int n = matrix.length;
        for(int i = 0; i < n/2; i++){
            for(int j =0; j < n - i -1; j++){
                // Swap elements in each cycle
                //clockwise direction
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - j][i];
                matrix[n - 1 -j][i] = matrix[n - 1 - i][n - 1 - j];
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
                matrix[j][n - 1 - i]=temp;
            }//end for loop of int j
        }//end for loop of int i
    }//end of function rotateImage90

    //Function for printing matrix
    public static void printMatrix(int matrix[][]){
        for (int i = 0; i <matrix.length ; i++){
            for (int j = 0; j<matrix[0].length; j++){
                System.out.print( matrix[i][j] + " ");
            }// end of column loop
            System.out.println();
        }//end of row loop
    }
}
