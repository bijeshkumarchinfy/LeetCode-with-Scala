import scala.collection.mutable.ArrayBuffer
object Solution {
    def averageOfLevels(root: TreeNode): Array[Double] = {
        //to store "sum of values, no. of elements" of Nth level at Nth index of store   // root, left, right
        val store = ArrayBuffer[Array[Double]]()
        preOrder(root, 0, store)
        store.map(x=> x(0)/x(1)).toArray
    }


    def preOrder(root: TreeNode, level: Int, store: ArrayBuffer[Array[Double]]){
        root match{
            case node:TreeNode => {
                if(store.size<=level)
                    store += Array[Double](0,0)
                store(level)(0) += node.value
                store(level)(1) += 1
                preOrder(node.left, level+1, store)
                preOrder(node.right, level+1, store)
            }
            case _ => {}
        }
    }
}



