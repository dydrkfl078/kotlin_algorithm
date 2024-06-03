package programmers_lv1

import java.lang.Exception

private fun solution(s: String): Int {
    var answer  = s

    val enNums = listOf("zero","one","two","three","four","five","six","seven","eight","nine")

    try {

        enNums.forEachIndexed { index, str ->
            answer = answer.replace(str,"$index")
        }

        return answer.toInt()

    } catch ( e: Exception) {
        println(e)
    }

    return 0
}

fun main() {
    val testA = "2three45sixseveng"

    println(solution(testA))
}