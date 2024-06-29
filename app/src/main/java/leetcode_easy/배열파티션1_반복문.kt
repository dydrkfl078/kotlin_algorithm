package leetcode_easy

private fun solution(nums : IntArray): Int {

    return nums.sorted()
        .withIndex()
        .filter { it.index % 2 == 0 }
        .sumOf { it.value }
}

fun main() {
    val nums = intArrayOf(1,3,2,4)

    println(solution(nums))
}