import java.util.*;


class Solution {
    public boolean solve(int n) {
        int t = n;
        int sum = 0;
        int pow = (int) Math.log10(n) + 1;
        while (n > 0) {
            sum += (int) Math.pow(n % 10, pow);
            n /= 10;
        }
        return t == sum;
    }
}
