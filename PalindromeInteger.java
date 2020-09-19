import java.util.*;


class Solution {
    private int rev(int x) {
        int y = 0;
        while (x > 0) {
            y *= 10;
            y += x % 10;
            x /= 10;
        }
        return y;
    }
    public boolean solve(int num) {
        return num == rev(num);
    }
}
