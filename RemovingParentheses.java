import java.util.*;


class Solution {
    public int solve(String s) {
        int res = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
            } else {
                if (count == 0) res++;
                else count--;
            }
        }
        return res + count;
    }
    
    public int solve1(String s) {
        Stack<Character> p = new Stack<>();
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                p.push(s.charAt(i));
            } else {
                if (p.empty()) res++;
                else p.pop();
            }
        }
        return res + p.size();
    }
}
