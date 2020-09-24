import java.util.*;


class Solution {
    public int[] solve(int[] nums) {
        int carry = 0;
        for (int i = nums.length - 1; i > -1; i--) {
            if (i == nums.length - 1) nums[i]++;
            nums[i] += carry;
            carry = nums[i] / 10;
            nums[i] %= 10;
        }
        if (carry > 0) {
            int[] res = new int[nums.length+1];
            res[0] = carry;
            for (int i = 0; i < nums.length; i++) res[i+1] = nums[i];
            return res;
        }
        return nums;
    }
}
