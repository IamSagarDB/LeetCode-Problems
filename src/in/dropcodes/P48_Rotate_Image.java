package in.dropcodes;

public class P48_Rotate_Image {
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

        int[][] res = rotate_90_d(matrix);

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
     * SC : O ( 1 )
     */
    private static int[][] rotate_90_d(int[][] matrix) {

        int N = matrix.length;

        // Transpose the matrix

        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // rotate 2D - array
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][N - 1 - j];
                matrix[i][N - 1 - j] = temp;
            }
        }

        return matrix;
    }
}
