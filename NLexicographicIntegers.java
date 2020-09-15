import java.util.*;


class Solution {
    public int[] solve(int n) {
        Set<String> s = new TreeSet<> ();
        for (int i = 1; i <= n; i++) s.add(Integer.toString(i));
        
        int[] res = new int[n];
        int idx = 0;
        for (String i : s) res[idx++] = Integer.parseInt(i);
        return res;
    }
}
