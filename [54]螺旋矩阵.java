import java.util.ArrayList;
import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;

        List<Integer> ret = new ArrayList<>(m * n);
        while (true) {
            // left to right at top
            for (int i = left; i <= right; i++) {
                ret.add(matrix[top][i]);
            }
            if (++top > bottom) {
                break;
            }
            // top to bottom at right
            for (int i = top; i <= bottom ; i++) {
                ret.add(matrix[i][right]);
            }
            if (--right < left) {
                break;
            }
            // right to left at bottom
            for (int i = right; i >= left ; i--) {
                ret.add(matrix[bottom][i]);
            }
            if (--bottom < top) {
                break;
            }
            // bottom to top at left
            for (int i = bottom; i >= top; i--) {
                ret.add(matrix[i][left]);
            }
            if (++left > right) {
                break;
            }
        }
        return ret;
    }
}