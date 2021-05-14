package in.dropcodes;

public class P867_Transpose_Matrix {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];

        int num = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ++num;
            }
        }


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }

        int[][] res = transpose(matrix);

        System.out.println("\n");

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println("");
        }

    }

    /**
     * TC : O ( N ^ 2) + (N ^ 2) = O ( N ^ 2)
     * SC : O ( N )
     */
    private static int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int[][] new_matrix = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                new_matrix[j][i] = matrix[i][j];
            }
        }

        return new_matrix;
    }
}
