import scala.collection.mutable.Map
object Solution {
    def isAnagram(s: String, t: String): Boolean = {
        val freq = Map[Char, Int]()
        for(char<-s)
            freq(char) = freq.getOrElse(char, 0)+1
        
        for(char<-t){
            if(!freq.contains(char)) return false
            freq(char)-=1
        }

        for(char<-s)
            if(freq(char)!=0) return false

        true
    }
}
