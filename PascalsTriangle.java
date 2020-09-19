import java.util.*;


class Solution {
    
    public int[] solve(int n) {
        int[] res = new int[n+1];
        res[0] = 1;
        
        for (int i = 1; i <= n; i++) {
            res[i] = res[i-1] * (n - i + 1) / i;
        }
        return res;
    }
    
    public int[] solve1(int n) {
        int[] res = new int[n+1];
        res[0] = 1;
        if (n == 0) return res;
        
        res[1] = 1;
        if (n == 1) return res;
        
        int[] prev = res.clone();
        for (int i = 2; i < n + 1; i++) {
            for (int j = 1; j < i; j++) {
                res[j] = prev[j-1] + prev[j];
            }
            res[i] = 1;
            // System.out.println(Arrays.toString(res));
            prev = res.clone();
        }
        return res;
    }
}
