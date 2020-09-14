import java.util.*;


class Solution {
    public int solve(int[] nums) {
        int start = 0;
        int res = 0;
        while (start < nums.length) {
            int a = start;
            int b = nums.length - 1;
            int mid;
            
            while (a < b) {
                mid = a + (b - a + 1) / 2;
                if (nums[mid] == nums[start]) a = mid;
                else b = mid - 1;
            }
            
            start = a + 1;
            res++;
        }
        return res;
    }
    
    public int solve1(int[] nums) {
        if (nums.length == 0) return 0;
        int res = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) res++;
        }
        return res;
    }
}
