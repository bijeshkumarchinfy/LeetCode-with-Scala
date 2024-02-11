object Solution {
    def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {
        var (point1, point2, pointSorted) = (m-1, n-1, n+m-1)
        while(point1>=0 && point2>=0){
            if(nums1(point1)>nums2(point2)){
                nums1(pointSorted) = nums1(point1)
                point1 -= 1
                pointSorted -= 1
            }
            else{
                nums1(pointSorted) = nums2(point2)
                point2 -= 1
                pointSorted -= 1
            }
        }
        while(point2>=0){
            nums1(pointSorted) = nums2(point2)
            point2 -= 1
            pointSorted -= 1
        }
    }
}
