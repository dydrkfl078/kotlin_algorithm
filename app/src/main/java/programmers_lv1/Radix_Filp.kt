package programmers_lv1

private fun solution(n: Int): Int {
    return n.toString(3).reversed().toInt(3)
}

fun main() {
    val testA = 45

    solution(testA)
}