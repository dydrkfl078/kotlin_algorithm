package programmers_lv1

import java.lang.StringBuilder

private fun solution(X: String, Y: String): String {
    var answer: String = ""


    X.filter { Y.contains(it) }.run {
        if (this.isEmpty()) {
            answer = "-1"
        } else {
            this.toList().distinct().joinToString("").map { n ->
                n to Y.count { it == n }.coerceAtMost( this.count { it == n })
            }.toSet().sortedByDescending { it.first }.forEach {
                var strBuilder = StringBuilder()
                for (i in 0 until it.second) {

                    strBuilder.append(it.first)
                }

                answer += strBuilder.toString()
            }

        }
    }

    return if (answer.filterNot { it == '0' }.isEmpty()) "0" else answer
}

fun main() {
    var testX = "1000"
    var testY = "10000"

    println(solution(testX, testY))
}