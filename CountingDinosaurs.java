import java.util.*;


class Solution {
    public int solve(String animals, String dinosaurs) {
        Set<Character> d = new HashSet<> ();
        for (char c : dinosaurs.toCharArray()) d.add(c);
        int res = 0;
        for (char c : animals.toCharArray()) {
            if (d.contains(c)) res++;
        }
        return res;
    }
}
