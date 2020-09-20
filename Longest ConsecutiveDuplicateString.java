import java.util.*;


class Solution {
    public int solve(String s) {
        if (s.length() == 0) return 0;
        
        int combo = 1;
        int res = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i-1)) {
                res = Math.max(res, combo);
                combo = 0;
            }
            combo++;
        }
        return Math.max(res, combo);
    }
}
