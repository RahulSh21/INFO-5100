package edu.northeastern.rahul;

public class Main {

    public static void main(String[] args) {

        //Question 1 Shape class and two sub classes Rectangle and Square
        System.out.println("Question 1 Output ");
        Shape shape1 = new Shape("Shape1", "pink");
        System.out.println("shape1");
        System.out.println(shape1.printShape());

        Shape shape2 = new Shape("Shape2", "orange", 20, 30);
        System.out.println("shape2");
        System.out.println("area : " + shape2.getArea() + " perimeter : " + shape2.getPerimeter());
        System.out.println(shape2.printShape());

        Rectangle rectangle1 = new Rectangle(2);
        System.out.println("rectangle1");
        System.out.println("area : " + rectangle1.getArea() + " perimeter : " + rectangle1.getPerimeter());

        Rectangle rectangle2 = new Rectangle("Rectangle", "Purple",4, 7);
        System.out.println("rectangle2");
        System.out.println("area : " + rectangle2.getArea() + " perimeter : " + rectangle2.getPerimeter());
        System.out.println(rectangle2.printShape());

        Square square1 = new Square(3);
        System.out.println("square1");
        System.out.println("area : " + square1.getArea() + " perimeter : " + square1.getPerimeter());

        Square square2 = new Square("Square" , "black", 7);
        System.out.println("square2");
        System.out.println("area : " + square2.getArea() + " perimeter : " + square2.getPerimeter());
        System.out.println(square2.printShape());

        //Question 2 Sum class
        System.out.println("Question 2 Output ");
        Sum sum = new Sum();
        System.out.println(sum.add(2,3));
        System.out.println(sum.add(4,9,12));
        System.out.println(sum.add(4,5.0));
        System.out.println(sum.add(15.5,5));
        System.out.println(sum.add(1.0,6.4));

        // Question 1 LeetCode: Transpose Matrix
        //All function are define in different Function called TransposeMatrix
        //Assuming it's a square matrix
        System.out.println("LeetCode Question 1 Output ");
        int matrix[][] = {{1,2,3} , {4,5,6} , {7,8,9}};
        TransposeMatrix matrix1 =new TransposeMatrix();
        System.out.println("Given Matrix is ");
        matrix1.printMatrix(matrix);
        int transpose[][] = matrix1.transposeMatrix(matrix);
        System.out.println("Transpose Matrix a is " );
        matrix1.printMatrix(transpose);

        // Question 2 LeetCode: Shortest Word Distance
        //All function are define in different function called ShortestWordDistance
        System.out.println("LeetCode Question 2 Output ");
        String wordsDict[] ={"practice", "makes", "perfect", "coding", "makes"};
        String word1 = "makes";
        String word2 = "coding";
        ShortestWordDistance wordDistance = new ShortestWordDistance();
        int output = wordDistance.shortWordDistance(wordsDict, word1, word2);
        if (output > 0){
            System.out.println(" Shortest Word Distance is " + output);
        }else {
            System.out.println("Word not found");
        }

        // Question 3 LeetCode: Move Zero
        //All function are define in different function called MoveZero
        System.out.println("LeetCode Question 3 Output ");
        int nums[] ={0,1,0,3,1,2,0,0};
        MoveZero moveZero = new MoveZero();
        moveZero.printMoveZero(nums);
        moveZero.moveZerosToEnd(nums);
        System.out.println("\n Output of Move zero: ");
        moveZero.printMoveZero(nums);
        System.out.println();

        // Question4 LeetCode: Rotate Image
        //All function are define in different Function called RotateImage
        System.out.println("LeetCode Question 4 Output ");
        int rotateMatrix[][] = {{1,2,3} , {4,5,6} , {7,8,9}};
        RotateImage rotateImage = new RotateImage();
        System.out.println("Given Matrix is: ");
        rotateImage.printMatrix(rotateMatrix);
        rotateImage.rotateImage90(rotateMatrix);
        System.out.println("Matrix rotated by by 90 degrees: " );
        rotateImage.printMatrix(rotateMatrix);

        // Question 5 LeetCode: Spiral Matrix
        //All function are define in different function called SpiralMatrix
        System.out.println("LeetCode Question 5 ");
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        int matrix2[][] = { {1,2,3,4} , {5,6,7,8} , {9,10,11,12} };
        int sMatrix[] = spiralMatrix.spiralMatrix(matrix2);
        System.out.println("Output of Spiral Matrix");
        spiralMatrix.printSpiralMatrix(sMatrix);


        // Question 7 LeetCode: Add Strings
        //All function are define in different diffrent called AddStrings
        System.out.println("LeetCode Question 7 Output ");
        AddStrings sumString = new AddStrings();
        String num1 = "456" , num2 = "177";
        String resultaddstring = sumString.addString( num1, num2);
        System.out.println("Sum of two string " + resultaddstring);

        // Question 8 LeetCode: Valid Palindrome
        //All function are define in different Function called ValidPalindrome
        System.out.println("LeetCode Question 8 ");
        ValidPalindrome validPalindrome = new ValidPalindrome();
        String s1 = "A man, a plan, a canal: Panama ";
        boolean palindrome = validPalindrome.isPalindrome(s1);
        System.out.println("Given String is Palindrome " + palindrome);


    }
}
