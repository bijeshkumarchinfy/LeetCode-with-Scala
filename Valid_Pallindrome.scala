object Solution {
    def isPalindrome(s: String): Boolean = {
        var (left, right) = (0, s.size-1)
        while(left<right){
            
            while(!check(s(left))) { //move left pointer until we get a digit/letter
                left+=1
                if(left>=right) return true
            }
            while(!check(s(right))){ //move right pointer until we get a digit/letter
                right-=1
                if(left>=right) return true
            }
            if(s(left)>=97){ //handling lower case alphabets of left pointer
                if(s(right)>=97) {if(s(left)!=s(right)) return false}
                else if(s(left)-32!=s(right)+0) return false
            }
            else{  //handling lower case alphabets of right pointer
                if(s(right)>=97){if((s(left)+0)!=(s(right)-32)) return false}
                else if(s(left)!=s(right)) return false
            }
            left+=1
            right-=1
        }
        return true
    }

    def check(c:Char):Boolean={
        return c.isDigit || c.isLetter
    }
}
