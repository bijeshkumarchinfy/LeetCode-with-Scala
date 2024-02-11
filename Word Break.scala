object Solution {
    def wordBreak(s: String, wordDict: List[String]): Boolean = {
        val dp = Array.fill(s.length){-1}
        solver(0, s, wordDict.toSet, dp)
    }

    def solver(index:Int, s:String, dictionary:Set[String], dp:Array[Int]):Boolean={
        if(index==s.length) true
        else if(dp(index) != -1) dp(index)==1
        else{
            for(right<- index+1 to s.length.min(index+20)){
                val currWord = s.substring(index, right)
                if(dictionary.contains(currWord)){
                    if(solver(right, s, dictionary, dp)){
                        dp(index) = 1
                        return true
                    }
                }
            }
            dp(index) = 0
            false
        }
    }
}
