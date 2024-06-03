package programmers_lv1

private fun solution(sizes: Array<IntArray>): Int {
    var answer: Int = 0

    sizes.map {
        Pair<Int, Int>(it.maxOrNull()!!,it.minOrNull()!!)
    }.run { answer = this.sortedBy { it.first }.last().first * this.sortedBy { it.second }.last().second }

    return answer
}

fun main() {
    val testSizes = arrayOf(intArrayOf(60,50),intArrayOf(30,70),intArrayOf(60,30),intArrayOf(80,40))

    println(solution(testSizes))
}