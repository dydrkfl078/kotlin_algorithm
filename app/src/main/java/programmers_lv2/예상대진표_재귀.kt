package programmers_lv2

private fun solution(n: Int, a: Int, b: Int): Int {
    return matchSchedule((a+1)/2,(b+1)/2)
}

tailrec fun matchSchedule(a: Int, b: Int, afterRound: Int = 1): Int {
    if (a == b) return afterRound
    return matchSchedule((a+1)/2, (b+1)/2, afterRound + 1)
}

fun main() {
    val n = 8
    val a = 4
    val b = 7

    println(solution(n, a, b))
}