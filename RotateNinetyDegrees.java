public class RotateNinetyDegrees {
    public static void main(String[] args) {
        int[][] nums = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] r = rotate(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.print(r[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] rotate(int[][] nums) {
        int n = nums.length;
        int[][] r = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                r[j][n - i - 1] = nums[i][j];
        return r;
    }
}
