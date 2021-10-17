package edu.northeastern.rahul;

public class Main {

    public static void main(String[] args) {
        // Question 1 LeetCode: Transpose Matrix
        //All function are define in different Function called TransposeMatrix
        //Assuming it's a square matrix
        System.out.println("LeetCode Question 1 Output ");
        int matrix[][] = {{1,2,3} , {4,5,6} , {7,8,9}};
        System.out.println("Given Matrix is ");
        printMatrix(matrix);
        int transpose[][] = transposeMatrix(matrix);
        System.out.println("Transpose Matrix a is " );
        printMatrix(transpose);
    }

    //Function for Transpose Matrix
    public static int[][] transposeMatrix( int[][] matrix)
    {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] transpose = new int[col][row];

        for (int i = 0; i < row; i++)
        {
            int[] arr = matrix[i];
            for(int j = 0 ; j < col; j ++){
                transpose[j][i] = arr[j];
            }
        }
        return transpose;
    }//end of transpose function

    //Print function
    public static void printMatrix(int matrix[][]){
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i <row ; i++){
            for (int j = 0; j<col; j++){
                System.out.print( matrix[i][j] + " ");
            }// end of column loop
            System.out.println();
        }//end of row loop
    }//end of print function
}
