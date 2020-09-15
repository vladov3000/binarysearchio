import java.util.*;


class Solution {
    public int solve(int[] nums) {
        int[] nums1 = nums.clone();
        Arrays.sort(nums1);
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums1[i]) res++;
        }
        return res;
    }
}
