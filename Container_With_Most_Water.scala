object Solution {
    def maxArea(height: Array[Int]): Int = {
        var (left, right, ans) = (0, height.size-1, 0)
        while(left<right){
            ans = ans.max((right-left)*height(left).min(height(right)))
            //moving lower value pointer
            if(height(left)<height(right)) left+=1
            else right-=1
        }
        ans
    }
}
