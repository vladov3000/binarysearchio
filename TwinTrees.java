import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    public boolean solve(Tree root0, Tree root1) {
        if (root0 == null ^ root1 == null) return false;
        if (root0 == null) return true;
        
        if (root0.val != root1.val) return false;
        return solve(root0.left, root1.left)
            && solve(root0.right, root1.right);
    }
}
