package leetcode_easy

class TwoOutOfThree2032 {
    fun twoOutOfThree(nums1: IntArray, nums2: IntArray, nums3: IntArray): List<Int> {
        val totalMap = HashMap<Int, Int>()

        listOf(nums1,nums2,nums3).forEach {nums ->
            nums.toSet().forEach { n  ->
                totalMap[n] = totalMap[n]?.let { it + 1 } ?: 1
            }
        }

        return totalMap.filter { it.value > 2 }.keys.toList()
    }
}

fun main() {
    val nums1 = intArrayOf(1,3,4)
    val nums2 = intArrayOf(2,2,2,2,5,4)
    val nums3 = intArrayOf(1,1,3,3,3)

    TwoOutOfThree2032().twoOutOfThree(nums1, nums2, nums3)
}