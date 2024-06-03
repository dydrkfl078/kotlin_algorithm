package com.example.algorithm_programmers.lv0

private fun solution (phoneNum : String): String {
    var answer = phoneNum.replaceRange(0,phoneNum.length-4,"*".repeat(phoneNum.length-4))

    return answer
}

fun main() {
    val testA = "01011112222"
    val testB = "2222"
    val testC = "010111122223334"

    println(solution(testA))
    println(solution(testB))
    println(solution(testC))
}
