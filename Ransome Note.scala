import scala.collection.mutable.Map
object Solution {
    def canConstruct(ransomNote: String, magazine: String): Boolean = {
        var (m1, m2) = (Map[Char, Int](), Map[Char, Int]())
        for(i<-ransomNote){
            if(m1.contains(i)) m1(i)+=1
            else m1(i)=1
        }
        for(i<-magazine){
            if(m2.contains(i)) m2(i)+=1
            else m2(i)=1
        }
        for(i<-ransomNote){
            if(!m2.contains(i)) return false
            else if(m1(i)>m2(i)) return false
        }
        true
    }
}
