import java.util.*;

class Solution {
    public int solve(int[][] intervals, int point) {
        int res = 0;
        for (int[] ran : intervals) {
            if (ran[0] <= point && point <= ran[1]) res++;
        }
        return res;
    }
}
