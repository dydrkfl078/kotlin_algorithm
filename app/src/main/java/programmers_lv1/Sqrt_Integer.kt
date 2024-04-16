package programmers_lv1

private fun solution(n: Long): Long {
    var answer: Long = 0L
    var sqrt = Math.sqrt(n.toDouble())
    answer = if ( sqrt == sqrt.toInt().toDouble()) {
        ((sqrt+1) * (sqrt+1)).toLong()
    } else {
        -1
    }
    return answer
}

fun main() {
    val testA = 17L

    println(solution(testA))
}