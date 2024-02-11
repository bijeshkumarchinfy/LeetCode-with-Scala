object Solution {
    def findMin(nums: Array[Int]): Int = {
        var ans = Int.MaxValue
        var (l, r) = (0, nums.size-1)
        while(l<=r){
            val mid = (r-l)/2 + l
            if(nums(mid)<nums(r)){ //whether right side is sorted
                ans = ans.min(nums(mid))
                r = mid-1
            } 
            else{
                ans = ans.min(nums(l))
                l = mid+1
            }
        }
        ans
    }
}
