import java.util.*;


class Solution {
    public int solve(String[] words) {
        char[] temp;
        for (int i = 0; i < words.length; i++) {
            temp = words[i].toCharArray();
            Arrays.sort(temp);
            words[i] = new String(temp);
        }
        Arrays.sort(words);
        // System.out.println(Arrays.toString(words));
        
        int streak = 1;
        int best = 1;
        for (int i = 1; i < words.length; i++) {
            if (!words[i].equals(words[i-1])) {
                if (streak > best) best = streak;
                streak = 0;
            }
            streak++;
        }
        if (streak > best) best = streak;
        return best;
    }
}
