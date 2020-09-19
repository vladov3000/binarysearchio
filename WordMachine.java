import java.util.*;


class Solution {
    public int solve(String[] ops) {
        Stack<Integer> s = new Stack<> ();
        for (String i : ops) {
            if (i.equals("POP")) {
                if (s.empty()) return -1;
                s.pop();
            } else if (i.equals("DUP")) {
                if (s.empty()) return -1;
                s.push(s.peek());
            } else if (i.equals("+")) {
                if (s.size() < 2) return -1;
                s.push(s.pop() + s.pop());
            } else if (i.equals("-")) {
                if (s.size() < 2) return -1;
                s.push(s.pop() - s.pop());
            } else {
                s.push(Integer.parseInt(i));
            }
        }
        if (s.empty()) return -1;
        return s.peek();
    }
}
