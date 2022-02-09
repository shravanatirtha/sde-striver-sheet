public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        setZero(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++)
                System.out.print(matrix[i][j]+" ");
            System.out.println();
        }

    }

    public static void setZero(int[][] a) {
        int row = a.length;
        int col = a[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (a[i][j] == 0) {
                    int index = i - 1;
                    while (index >= 0) {
                        if (a[index][j] != 0)
                            a[index][j] = -1;
                        index--;
                    }
                    index = i + 1;
                    while (index < row) {
                        if (a[index][j] != 0)
                            a[index][j] = -1;
                        index++;
                    }
                    index = j - 1;
                    while (index >= 0) {
                        if (a[i][index] != 0)
                            a[i][index] = -1;
                        index--;
                    }
                    index = j + 1;
                    while (index < col) {
                        if (a[i][index] != 0)
                            a[i][index] = -1;
                        index++;
                    }
                }
            }
        }
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                if (a[i][j] < 0)
                    a[i][j] = 0;
    }
}
