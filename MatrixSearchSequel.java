import java.util.*;


class Solution {
    public boolean solve(int[][] matrix, int target) {
        for (int[] row : matrix) {
            for (int i : row) {
                if (i == target) return true;
            }
        }
        return false;
    }
}
