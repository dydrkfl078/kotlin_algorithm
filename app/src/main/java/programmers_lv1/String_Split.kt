package programmers_lv1

private fun solution(s: String): String {
    var answer =

    s.split(" ").map {
        it.mapIndexed { index, s ->
            if ( index % 2 == 0) {
                s.uppercase()
            } else {
                s.lowercase()
            }
        }.joinToString("")
    }.joinToString(  " ")

    return answer
}

fun main() {
    val testA = "try hello world"

    println(solution(testA))
}