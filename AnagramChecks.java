import java.util.*;


class Solution {
    public boolean solve(String s0, String s1) {
        if (s0.length() != s1.length()) return false;
        
        char[] a0 = s0.toCharArray();
        char[] a1 = s1.toCharArray();
        
        Arrays.sort(a0);
        Arrays.sort(a1);

        for (int i = 0; i < a0.length; i++) {
            if (a0[i] != a1[i]) return false;
        }
        return true;
    }
}
