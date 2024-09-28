package leetcode_easy

class MergeTwo2DArrays2570 {
    fun mergeArrays(nums1: Array<IntArray>, nums2: Array<IntArray>): Array<IntArray> {
        val mergeMap = HashMap<Int, Int>()

        nums1.forEach { nums ->
            mergeMap[nums.first()] = mergeMap[nums.first()]?.let { it + nums.last()} ?: nums.last()
        }

        nums2.forEach { nums ->
            mergeMap[nums.first()] = mergeMap[nums.first()]?.let { it + nums.last()} ?: nums.last()
        }

        return mergeMap.map {
            intArrayOf(it.key,it.value)
        }.sortedBy { it.first() }.toTypedArray()
    }
}