public class MatrixDiagonalSum {
        public static int diagonalSum(int[][] mat) {
            int sum = 0;
            int n = mat.length;
            
            for (int i = 0; i < n; i++) {
                sum += mat[i][i]; // Add element from primary diagonal
                
                // Check if element is not part of the primary diagonal
                if (i != n - 1 - i) {
                    sum += mat[i][n - 1 - i]; // Add element from secondary diagonal
                }
            }
            
            return sum;
        }
        
        public static void main(String[] args) {
            int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
            
            int diagonalSum = diagonalSum(mat);
            System.out.println("Sum of matrix diagonals: " + diagonalSum);
        }
    }
     
