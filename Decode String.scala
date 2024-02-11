import scala.collection.mutable.Stack
import scala.collection.mutable.StringBuilder

object Solution {
    def decodeString(s: String): String = {
        val st = Stack[Char]()
        var index = s.length-1
        for(ch<- s){
            if(ch==']'){
                var curr = new StringBuilder
                while(!st.isEmpty && st.top.isLetter)
                    curr.append(st.pop)
                curr = curr.reverse
                st.pop
                var num = ""
                while(!st.isEmpty && st.top.isDigit)
                     num+=st.pop
                num = num.reverse
                val res = curr.toString * num.toInt
                for(char<-res) st.push(char)
            }
            else{
                st.push(ch)
            }
        }
        
        var ans = new StringBuilder
        while(!st.isEmpty) ans += st.pop
        ans.reverse.toString
    }
}
