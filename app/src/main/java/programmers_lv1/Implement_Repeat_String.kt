package programmers_lv1

private fun solution(n: Int): String {
    var answer = ""

    for (i in 0 until n ) {
        if (answer.length % 2 == 0) {
            answer += "수"
        } else {
            answer += "박"
        }
    }
    return answer
}

fun main() {
    solution(4)
}