package programmers_lv1

private fun solution(lottos: IntArray, win_nums: IntArray): IntArray {

    val lowLate = (7 - win_nums.filter { lottos.contains(it) }.size).coerceAtMost(6)
    val highLate = (lowLate - lottos.filter { it == 0 }.size).coerceAtLeast(1)

    return intArrayOf(highLate,lowLate)
}

fun main() {
    val testA = intArrayOf( 44, 1, 0, 0, 31, 25)
    val testWinNums = intArrayOf(31,10,45,1,6,19)

    println(solution(testA,testWinNums).toList())
}