package programmers_lv1

private fun solution(X: String, Y: String): String {
    var answer: String = ""

    X.filter { Y.contains(it) }.run {
        if (this.isEmpty()) {
            answer = "-1"
        } else {
            this.map { n ->
                n to Y.count { it == n }
            }.toSet().sortedByDescending { it.first }.forEach {
                answer += "${it.first}".repeat(it.second)
            }
        }
    }

    return if (answer.sumOf{ "${it}".toInt() } == 0) "0" else answer
}

fun main() {
    var testX = "12321"

    testX += "6".repeat(2900000)
    var testY = "666666"

    testY += "6".repeat(2900000)
    println(solution(testX, testY))
}