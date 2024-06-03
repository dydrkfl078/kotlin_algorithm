package programmers_lv1

private fun solution(s: String): String {
    var answer = s.split("").sortedDescending().joinToString("")
    return answer
}

fun main() {
    val testA = "Zbcdefg"

    println(solution(testA))
}