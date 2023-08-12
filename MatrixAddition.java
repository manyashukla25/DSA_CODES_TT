public class MatrixAddition {
    public static void matrixAddition(int[][] matrixA, int[][] matrixB) {
        int n = matrixA.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        } 
        // Printing the result matrix
        for (int[] row : result) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrixA = {
            {1, 2}, 
            {3, 4} };
        int[][] matrixB = {
            {4, 3}, 
            {2, 1} };
        matrixAddition(matrixA, matrixB);
    }
}
