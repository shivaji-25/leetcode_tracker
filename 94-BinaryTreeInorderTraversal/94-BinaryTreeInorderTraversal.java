// Last updated: 12/08/2026, 12:18:31
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        dfs(root, result); 
        return result;
    }

    private void dfs(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        
        dfs(root.left, result);
        result.add(root.val);      
        dfs(root.right, result);   
    }
}
