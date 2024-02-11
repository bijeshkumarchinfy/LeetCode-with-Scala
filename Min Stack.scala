import scala.collection.mutable.Stack
class MinStack() {
    val s = Stack[(Int, Int)]()
    s.push((0, Int.MaxValue))

    def push(`val`: Int) {
        s.push((`val`, getMin().min(`val`)))
    }

    def pop() {
        s.pop()._1
    }

    def top(): Int = {
        s.top._1
    }

    def getMin(): Int = {
        s.top._2
    }

}
