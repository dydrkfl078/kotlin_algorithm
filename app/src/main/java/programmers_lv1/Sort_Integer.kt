package programmers_lv1

private fun solution (n : Long): Long {
    var answer = n.toString().map {
        "$it".toInt()
    }.sortedDescending().joinToString("").toLong()

    return answer
}

fun main() {
    val testA = 8791452L

    println(solution(testA))
}