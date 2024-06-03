package programmers_lv1

private fun solution(k: Int, m: Int, score: IntArray): Int {
    var answer: Int = 0

    score.sortedDescending().toList().chunked(m).forEach {
        if (it.size == m) {
            answer += it.minOrNull()!! * m
        }
    }

    return answer
}

fun main() {
    val testA = intArrayOf(4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2,1,1)

    println(solution(4,3,testA))
}