import java.util.*;

class Solution {
    public boolean solve(String older, String newer) {
        int num1 = 0;
        int num2 = 0;
        int idx1 = 0;
        int idx2 = 0;
        char c1;
        char c2;
        while(idx1 < older.length() && idx2 < newer.length()) {
            c1 = older.charAt(idx1);
            c2 = newer.charAt(idx2);
            if (c1 == '.' && c2 == '.') {
                if (num1 != num2) return num1 < num2;
                idx1++;
                idx2++;
                num1 = 0;
                num2 = 0;
            } else {
                if (c1 != '.') {
                    num1 *= 10;
                    num1 += c1 - '0';
                    idx1++;
                }
                if (c2 != '.') {
                    num2 *= 10;
                    num2 += c2 - '0';
                    idx2++;
                }
            }
        }
        while(idx1 < older.length()) {
            num1 *= 10;
            num1 += older.charAt(idx1++) - '0';
        }
        while(idx2 < newer.length()) {
            num2 *= 10;
            num2 += newer.charAt(idx2++) - '0';
        }
        if (num1 != num2) return num1 < num2;
        return false;
    }
}
