object Solution {
    def search(nums: Array[Int], target: Int): Int = {
        var (l, r) = (0, nums.size-1)
        while(l<=r){
            val mid = (r-l)/2 + l
            if(nums(mid)==target) return mid
            else if(nums(mid)<nums(r)){
                if(target>nums(mid) && target<=nums(r)){
                    l = mid+1
                }
                else
                    r = mid-1
            }
            else{
                if(target>=nums(l) && target<nums(mid))
                    r = mid-1
                else
                    l = mid+1
            }
        }
        -1
    }
}
