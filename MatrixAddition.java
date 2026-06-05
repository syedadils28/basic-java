public class MatrixAddition {
    public static void main(String[] args) {

        // Matrix A
        int[][] A = {
            {1, 2},
            {3, 4}
        };

        // Matrix B
        int[][] B = {
            {5, 6},
            {7, 8}
        };

        // Result matrix
        int[][] result = new int[2][2];

        // Add A + B
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }

        // Print Matrix A
        System.out.println("Matrix A:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        // Print Matrix B
        System.out.println("Matrix B:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }

        // Print Result
        System.out.println("Result (A + B):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
