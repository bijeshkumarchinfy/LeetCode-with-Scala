import scala.collection.mutable.ArrayBuffer
class NestedIterator(_nestedList: List[NestedInteger]) {
    var ans = ArrayBuffer[Int]()
    for(node<-_nestedList)
        flattenList(node, ans)
    var i = 0
    def next(): Int = {
        val x = ans(i)
        i+=1
        x
    }
    
    def hasNext(): Boolean = {
        ans.size>i
    }


    def flattenList(node:NestedInteger, ans:ArrayBuffer[Int]){
        if(node.isInteger) ans += node.getInteger
        else{
            val currList = node.getList
            for(subNode<-currList)
                flattenList(subNode, ans)
        }
    }
}
