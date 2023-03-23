public class MatrixMultiplication {
   public static void main(String[] args) {
      int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // 3 x 3 matrix
      int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}}; // 3 x 3 matrix

      int[][] result = new int[3][3];

      // Perform matrix multiplication
      for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
               result[i][j] += matrix1[i][k] * matrix2[k][j];
            }
         }
      }

      // Print the result matrix
      for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
            System.out.print(result[i][j] + " ");
         }
         System.out.println();
      }
   }
}
