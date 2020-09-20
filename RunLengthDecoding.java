import java.util.*;


class Solution {
    public String solve(String s) {
        String res = "";
        int num = 0;
        for (char c : s.toCharArray()) {
            if ('0' <= c && c <= '9') {
                num *= 10;
                num += c - '0';
            } else {
                for (int i = 0; i < num; i++) res += c;
                num = 0;
            }
        }
        return res;
    }
    
    public String solve1(String s) {
        String res = "";
        int idx = 0;
        int dig;
        int count;
        
        while(idx < s.length()) {
            dig = s.charAt(idx) - '0';
            count = 0;
            
            while (-1 < dig && dig < 10) {
                count *= 10;
                count += dig;
                dig = s.charAt(++idx) - '0';
            }
            for (int i = 0; i < count; i++) {
                res += s.charAt(idx);
            }
            idx++;
        }
        return res;
    }
}
