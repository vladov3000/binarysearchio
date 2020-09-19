import java.util.*;


class Solution {
    public String solve1(String[] words) {
        String pre = "";
        Boolean done = false;
        int idx = 0;
        while (!done) {
            if (words[0].length() == pre.length()) return pre;
            for (int i = 1; i < words.length; i++) {
                if (idx >= words[i].length() ||
                        words[0].charAt(idx) != words[i].charAt(idx)) {
                    done = true;
                    return pre;
                }
            }
            if (!done) pre += words[0].charAt(idx);
            idx++;
        }
        return pre;
    }
    
    public String solve(String[] words) {
        String res = "";
        for (String w : words) {
            if (res == "" || w.length() < res.length()) res = w;
        }
        for (String w : words) {
            if (w == res) continue;
            for (int i = 0; i < res.length(); i++) {
                if (w.charAt(i) != res.charAt(i)) {
                    res = res.substring(0, i);
                    break;
                }
            }
        }
        return res;
    }
}
