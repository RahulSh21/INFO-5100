package edu.northeastern.rahul;

public class TransposeMatrix {
    //Function for Transpose Matrix
    public int[][] transposeMatrix( int[][] matrix)
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
