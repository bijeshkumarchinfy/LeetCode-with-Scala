object Solution {
    def sortedArrayToBST(nums: Array[Int]): TreeNode = {
        def makeBST(l:Int, r:Int):TreeNode={
            if(l>r) return null
            if(l==r) return new TreeNode(_value=nums(l))
            val mid = (r-l)/2+l
            val node = new TreeNode(_value = nums(mid))
            node.left = makeBST(l, mid-1)
            node.right = makeBST(mid+1, r)
            node
        }
        makeBST(0, nums.size-1)
    }
}
