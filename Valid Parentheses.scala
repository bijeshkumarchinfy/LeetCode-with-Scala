import scala.collection.mutable.Stack
object Solution {
    def isValid(s: String): Boolean = {
        val st = Stack[Char]()
        for(ch<- s){
            if(ch=='(' | ch=='{' | ch=='[')
                st.push(ch)
            else if(st.isEmpty) return false
            else
                if(ch==')')
                    if(st.top=='(')
                        st.pop
                    else
                        return false
                else if(ch=='}')
                    if(st.top=='{')
                        st.pop
                    else
                        return false
                else
                    if(st.top=='[')
                        st.pop
                    else
                        return false
        }
        st.isEmpty
    }
}
