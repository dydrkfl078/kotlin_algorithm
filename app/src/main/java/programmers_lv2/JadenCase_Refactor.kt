package programmers_lv2

private fun solution(s: String): String {
    var answer = ""

    for ((index, item) in s.withIndex()) {
        if (index == 0 || s[index - 1].toString() == " ") {
            answer += item.uppercase()
        } else {
            answer += item.lowercase()
        }
    }

    return answer
}

fun main() {
    val s = "3people people llowed me"
    println(solution(s))
}