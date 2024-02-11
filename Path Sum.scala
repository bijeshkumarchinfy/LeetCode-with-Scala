object Solution {
    def hasPathSum(root: TreeNode, targetSum: Int): Boolean = {
        if(root==null)
            false
        else
            dfs(root, targetSum)
    }

    def dfs(root: TreeNode, targetSum: Int): Boolean = {
        if(root.left==null && root.right==null){
            targetSum == root.value
        }
        else{
            if(root.left!=null && dfs(root.left, targetSum-root.value)) true
            else if(root.right!=null && dfs(root.right, targetSum-root.value)) true
            else false
        }
    }
}
