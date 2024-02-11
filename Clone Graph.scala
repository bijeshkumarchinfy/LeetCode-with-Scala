import scala.collection.mutable.Map
object Solution {
    def cloneGraph(graph: Node): Node = {
        if(graph==null) return null
        val vis = Map[Int, Node]()
        val x = graphBuilder(graph, vis)
        //println(vis)
        x
    }

    def graphBuilder(graph:Node, vis:Map[Int, Node]):Node={
        if(vis.contains(graph.value)){
            println("found "+graph.value)
            vis(graph.value)
        }
        else{
            //println("create "+graph.value)
            val node = new Node(graph.value)
            vis(graph.value) = node
            var buildNeighbors = List[Node]()
            for(neighbor<- graph.neighbors)
                buildNeighbors = graphBuilder(neighbor, vis) :: buildNeighbors
            node.neighbors = buildNeighbors.reverse
            //println("created "+node.value+" "+node.neighbors.foreach(x=> print(x.value)))
            
            node
        }
    }
}
