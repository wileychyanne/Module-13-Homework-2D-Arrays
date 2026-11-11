public class MatrixAddition {
    public static void main(String[] args) {
        int[][] matrixA = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] matrixB = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };
        int[][] result = new int[3][3];
        // Add the two matrices
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                result[row][col] = matrixA[row][col] + matrixB[row][col];
            }
        }
        //display Matrix A
        System.out.println("Matrix A:");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(matrixA[row][col] + "\t");
            }
            System.out.println();
        }
        //display matrix
        System.out.println("Matrix B:");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(matrixB[row][col] + "\t");
            }
            System.out.println();
        }
        //display result
        System.out.println("Result:");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(result[row][col] + "\t");
            }
            System.out.println();
        }
    }
}
