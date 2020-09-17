import java.util.*;

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public int solve(LLNode node, int k) {
        LLNode a = node;
        LLNode b = node;
        while(k-- > 0) a = a.next;
        
        while(a.next != null) {
            a = a.next;
            b = b.next;
        }
        
        return b.val;
    }
}
