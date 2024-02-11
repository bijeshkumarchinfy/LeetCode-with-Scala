object Solution {
    def lengthOfLongestSubstring(s: String): Int = {
        val freq = new Array[Int](256)
        var i = 0
        var ans = 0
        var count = 0
        for(ch:Char<- s){
            count += 1
            freq(ch+0) += 1
            while(freq(ch+0)>1){
                freq(s(i)+0) -= 1
                count -= 1
                i += 1
            }
            ans = ans.max(count)
        }
        ans
        
    }
}
