package leetcode_easy

class MaximumFrequency3005 {
    fun maxFrequencyElements(nums: IntArray): Int {
        val frequencyMap = HashMap<Int, Int>()

        nums.forEach {
            if (frequencyMap[it] != null) {
                frequencyMap[it] = frequencyMap[it]!! + 1
            } else {
                frequencyMap[it] = 1
            }
        }

        val maxFrequency = frequencyMap.maxOf { it.value }

        return frequencyMap.filterValues { it == maxFrequency }.size * maxFrequency
    }
}

fun main() {
    val solution = MaximumFrequency3005()
    val arr = intArrayOf(1,2,2,1,4,5)
    println(solution.maxFrequencyElements(arr))

}