import java.util.*;


class Solution {
    public int solve(String s) {
        int res = 0;
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
            } else {
                if (count == 0) res++;
                else count--;
            }
        }
        return res + count;
    }
}
