import java.util.*;

class Solution {
    public boolean solve(int[][] intervals) {
        Arrays.sort(intervals, 
            (int[] a, int[] b) ->
                a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]
        );
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][1] <= intervals[i-1][1]) return true;
        }
        return false;
    }
    
    public boolean solve1(int[][] intervals) {
        for (int i = 0; i < intervals.length; i++) {
            int[] inter1 = intervals[i];
            for (int j = 0; j < intervals.length; j++) {
                if (i == j) continue;
                int[] inter2 = intervals[j];
                if (inter1[0] <= inter2[0] && inter2[1] <= inter1[1]) {
                    return true;
                }
            }
        }
        return false;
    }
}
