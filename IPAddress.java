import java.util.*;
import java.util.regex.Pattern;


class Solution {
    public boolean solve(String s) {
        return Pattern.matches(
            "((([1-9][0-5][0-5])|([1-9]?[0-9]))\\.){3}(([1-9][0-5][0-5])|([1-9]?[0-9]))", s);
    }
    
    public boolean solve1(String s) {
        int count = 0;
        int num = 0;
        char c;
        for (int i = 0; i < s.length(); i++) {
            if (num > 255) return false;
            if (count > 3) return false;
            c = s.charAt(i);
            
            if (c == '.') {
                count++;
                num = 0;
            } else if (c == '0' && i + 1 < s.length() - 1 
                    && s.charAt(i+1) != '.') {
                return false;
            } else if ('0' <= c && c <= '9') {
                num *= 10;
                num += c - '0';
            } else {
                return false;
            }
        }
        if (count != 3) return false;
        return true;
    }
}
