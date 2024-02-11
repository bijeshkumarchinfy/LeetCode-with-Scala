object Solution {
    def maxDepth(root: TreeNode): Int = {
        val ans = Array(0)
        solver(root, 0, ans)
        ans(0)
    }

    def solver(root:TreeNode, depth:Int, ans:Array[Int]){
        if(root==null) ans(0) = ans(0).max(depth)
        else{
            solver(root.left, depth+1, ans)
            solver(root.right, depth+1, ans)
        }
    }
}
