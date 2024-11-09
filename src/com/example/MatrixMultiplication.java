package com.example;
public class MatrixMultiplication {
    public static void main(String[] args) {
        // Define the 2x3 matrix
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Define the 3x2 matrix
        int[][] matrixB = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        // Result matrix will be 2x2
        int[][] resultMatrix = new int[2][2];

        // Perform matrix multiplication
        for (int i = 0; i < 2; i++) {                // Loop through rows of matrixA
            for (int j = 0; j < 2; j++) {            // Loop through columns of matrixB
                //resultMatrix[i][j] = 0;
                for (int k = 0; k < 3; k++) {        // Loop to perform multiplication
                	resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        // Print the result matrix
        System.out.println("Result of Matrix Multiplication:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}