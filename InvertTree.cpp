/**
 * class Tree {
 *     public:
 *         int val;
 *         Tree *left;
 *         Tree *right;
 * };
 */
Tree* solve(Tree* root) {
    if (root == NULL) {
        return root;
    }

    Tree* left = solve(root->left);
    Tree* right = solve(root->right);
    root->right = left;
    root->left = right;

    return root;
}
