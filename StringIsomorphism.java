import java.util.*;

class Solution {
    public boolean solve(String s, String t) {
        if (s.length() != t.length()) return false;
        
        for (int sCase = 0; sCase < 2; sCase++) {
            String toCompare = sCase == 0 ? s : t;
            String compareTo = sCase == 0 ? t : s;
            
            Map<Character, Character> map = new HashMap<> ();
            char c1;
            char c2;
            for (int i = 0; i < s.length(); i++) {
                c1 = toCompare.charAt(i);
                c2 = compareTo.charAt(i);
                if (!map.containsKey(c1)) {
                    map.put(c1, c2);
                } else if (map.get(c1) != c2){
                    return false;
                }
            }
        }
        return true;
    }
}
