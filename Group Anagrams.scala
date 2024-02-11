object Solution {
    def groupAnagrams(strs: Array[String]): List[List[String]] = {
        val grouped = strs.groupBy(x=> x.sorted)
        grouped.map(x=> x._2.toList).toList
    }
}
