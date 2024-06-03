package programmers_lv1

private fun solution(arr: IntArray): IntArray {
    return if (arr.size > 1) arr.filterNot { it == arr.minOrNull() }.toIntArray() else intArrayOf(-1)
}

fun main() {
    val testA = intArrayOf(2,1,4,5,3)
    val testB = intArrayOf(4)

    println(solution(testA).toList())
    println(solution(testB).toList())
}