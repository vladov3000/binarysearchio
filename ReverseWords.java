import java.util.*;


class Solution {
    public String solve(String sentence) {
        String res = "";
        String buff = "";
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                res = buff + (res.length() > 0 ? " " : "") + res;
                buff = "";
            }
            else buff += sentence.charAt(i);
        }
        res = buff + (res.length() > 0 ? " " : "") + res;
        return res;
    }
}
