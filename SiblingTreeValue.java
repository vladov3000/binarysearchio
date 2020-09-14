import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    public int solve(Tree root, int k) {
        if (root == null) return -1;
        
        int res = -1;
        if (root.left != null) {
            if (root.left.val == k) return root.right.val;
            res = solve(root.left, k);
        }
        if (root.left != null) {
            if (root.right.val == k) return root.left.val;
            if (res == -1) res = solve(root.right, k);
        }
        return res;
    }
    
    public int solve1(Tree root, int k) {
        Stack<Tree> toDo = new Stack<>();
        toDo.push(root);
        
        while(!toDo.empty()) {
            Tree cur = toDo.pop();
            if (cur.left != null) {
                if (cur.left.val == k) return cur.right.val;
                toDo.push(cur.left);
            }
            if (cur.right != null) {
                if (cur.right.val == k) return cur.left.val;
                toDo.push(cur.right);
            }
        }
        return -1;
    }
}
