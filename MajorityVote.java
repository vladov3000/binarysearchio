import java.util.*;


class Solution {
    public int solve(int[] nums) {
        Arrays.sort(nums);
        
        int start = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] != nums[i]) {
                if (i - start > nums.length / 2) return nums[i-1];
                start = i;
            }
        }
        if (nums.length - start > nums.length / 2) return nums[start];
        return -1;
    }
}
