import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    private void helper(Tree root, int[] res) {
        if (root == null) return;
        if (root.left != null || root.right != null) res[1]++;
        else res[0]++;
        helper(root.left, res);
        helper(root.right, res);
    }
    
    public int[] solve(Tree root) {
        int[] res = {0, 0};
        helper(root, res);
        return res;
    }
    
    public int[] solve1(Tree root) {
        int[] res = {0, 0};
        if (root == null) return res;
        
        Stack<Tree> toDo = new Stack<>();
        toDo.push(root);
        
        while(!toDo.empty()) {
            Tree cur = toDo.pop();
            if (cur.left == null && cur.right == null) res[0]++;
            else res[1]++;
            if (cur.left != null) toDo.push(cur.left);
            if (cur.right != null) toDo.push(cur.right);
        }
        return res;
    }
}
