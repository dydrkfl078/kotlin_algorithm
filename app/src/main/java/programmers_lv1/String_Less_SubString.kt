package programmers_lv1

private fun solution(t: String, p: String): Int {
    var answer: Int = 0

    for (i in 0..t.length-p.length) {
        if (t.substring(i, i + p.length).toLong() <= p.toLong()) {
            answer++
        }
    }
    return answer
}

fun main() {
    val testT = "222222222222222222"
    val testP = "222222222222222222"

    println(solution(testT,testP))
}