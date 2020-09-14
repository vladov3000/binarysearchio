import java.util.*;


class Solution {
    public int solve(String s) {
        Stack<Character> p = new Stack<>();
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                p.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                if (p.empty()) res++;
                else p.pop();
            }
        }
        return res + p.size();
    }
}
