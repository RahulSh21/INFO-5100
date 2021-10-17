package edu.northeastern.rahul;

public class Main {

    public static void main(String[] args) {
        // Question 5 LeetCode: Spiral Matrix
        //All function are define in different function called SpiralMatrix
        System.out.println("LeetCode Question 5 ");
        int matrix2[][] = { {1,2,3,4} , {5,6,7,8} , {9,10,11,12} };
        int sMatrix[] = spiralMatrix(matrix2);
        System.out.println("Output of Spiral Matrix");
        printSpiralMatrix(sMatrix);
    }

    public static int[] spiralMatrix(int matrix[][]){
        int m = matrix.length;
        int n = matrix[0].length;
        int[] spiralMatrix = new int[m*n];
        int top = 0, bottom = m - 1, left = 0, count = 0, right = n - 1;

        // Defining the direction in which the array is to be traversed.
        int direction = 1;

        while (top <= bottom && left <= right) {

            if (direction == 1) {    // moving left->right
                for (int i = left; i <= right; ++i) {
                    spiralMatrix[count++] = matrix[top][i];
                }
                // Since we have traversed the whole first
                // row, move down to the next row.
                ++top;
                direction = 2;
            }
            else if (direction == 2) {     // moving top->bottom
                for (int i = top; i <= bottom; ++i) {
                    spiralMatrix[count++] = matrix[i][right];
                }
                // Since we have traversed the whole last
                // column, move left to the previous column.
                --right;
                direction = 3;
            }
            else if (direction == 3) {     // moving right->left
                for (int i = right; i >= left; --i) {
                    spiralMatrix[count++] = matrix[bottom][i];
                }
                // Since we have traversed the whole last
                // row, move up to the previous row.
                --bottom;
                direction = 4;
            }
            else if (direction == 4) {     // moving bottom->up
                for (int i = bottom; i >= top; --i) {
                    spiralMatrix[count++] = matrix[i][left];
                }
                // Since we have traversed the whole first
                // col, move right to the next column.
                ++left;
                direction = 1;
            }
        }
        return spiralMatrix;
    }
    public static void printSpiralMatrix(int[] matrix){
        for(int i = 0; i<matrix.length; i++){
            System.out.print( matrix[i] +", ");
        }
    }
}
