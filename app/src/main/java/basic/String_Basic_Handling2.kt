package basic

private fun solution(a: String): String {
    var answer = ""
    var mode = 0
    if (a.isEmpty()) {
        answer = "EMPTY"
    }
    a.forEachIndexed { index, c ->
        when (mode) {
            0 -> {
                if (c.toString() != "1" && index % 2 == 0) {
                    println("b")
                    answer += c
                } else if (c.toString() == "1") {
                    println("a")
                    mode = 1
                }
            }

            1 -> {
                if (c.toString() != "1" && index % 2 == 1) {
                    answer += c
                } else if (c.toString() == "1") {
                    println("a")
                    mode = 0
                }
            }
        }
    }
    return answer
}

fun main() {
    var testA = "11111bbb"
    println(solution(testA))
}