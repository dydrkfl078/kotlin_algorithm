package basic

import java.util.Collections

private fun solution(a: Int, b: Int): Int {
    var answer = 0

    if ((a.toString() + b.toString()).toInt() > answer ) {
        answer = (a.toString() + b.toString()).toInt()
    }

    if ((b.toString() + a.toString()).toInt() > answer ) {
        answer = (b.toString() + a.toString()).toInt()
    }

    return answer
}

fun main() {
    var testA = 800
    var testB = 80
    var testC = 7

    println(solution(testA, testB))
}