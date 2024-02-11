object Solution {
    def threeSum(nums: Array[Int]): List[List[Int]] = {
        var arr = nums.sorted
                                                            
        var ans = List[List[Int]]()
        for(first<- 0 until nums.size-2){
            if(first!=0 && arr(first)==arr(first-1)){}
            else{
            var (l,r) = (first+1, nums.size-1)
            while(l<r && r<nums.size){
                val threeSum = arr(first)+arr(l)+arr(r)
                if(threeSum==0){
                    if(ans.size>0 && ans.head(0)==arr(first) && ans.head(1)==arr(l)){}
                    else ans = List(arr(first), arr(l), arr(r)) :: ans
                    l+=1
                    r-=1
                }else if(threeSum<0) l+=1
                else r-=1
            }}
        }
        return ans
    }
}
