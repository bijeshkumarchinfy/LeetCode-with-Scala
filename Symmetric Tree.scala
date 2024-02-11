object Solution {
    def isSymmetric(root: TreeNode): Boolean = {
        if(root==null) true
        dfs(root.left, root.right)
    }

    def dfs(left: TreeNode, right:TreeNode):Boolean={
        if(left==null || right==null) return left==right
        else left.value==right.value && dfs(left.left, right.right) && dfs(left.right, right.left)
    }
}
