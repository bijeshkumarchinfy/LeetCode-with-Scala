object Solution {
    def searchInsert(nums: Array[Int], target: Int): Int = {
        if(nums.size==0) return 0
        if(target>nums(nums.size-1)) return nums.size
        var index = -1
        var (l,r,mid) = (0,nums.size-1,0)
        while(l<=r){
            mid = (l+r)>>1
            if(nums(mid)==target) return mid
            else if(nums(mid)<target) l = mid+1
            else {index = mid; r = mid-1}
        }
        index
    }
}

