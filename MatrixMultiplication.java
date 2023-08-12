public class MatrixMultiplication {
    public static int[][] matrixMultiply(int[][] matrixA, int[][] matrixB) {
        int n = matrixA.length;
        int[][] result = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int[][] matrixA = {
            {1, 1, 1}, 
            {1, 1, 1}, 
            {1, 1, 1}
    };
        
        int[][] matrixB = {
            {1, 1, 1}, 
            {1, 1, 1},
            {1, 1, 1}
        };
        
        int[][] result = matrixMultiply(matrixA, matrixB);
        
        // Printing the result matrix
        for (int[] row : result) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
