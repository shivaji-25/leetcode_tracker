// Last updated: 12/08/2026, 12:17:27
import java.util.ArrayDeque;
import java.util.Deque;

class BSTIterator {
    // ArrayDeque is much faster than java.util.Stack
    private Deque<TreeNode> stack;

    public BSTIterator(TreeNode root) {
        this.stack = new ArrayDeque<>();
        pushAllLeft(root);
    }
    
    public int next() {
        TreeNode node = stack.pop();
        if (node.right != null) {
            pushAllLeft(node.right);
        }
        return node.val;
    }
    
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    private void pushAllLeft(TreeNode node) {
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }
}