package com.example.algorithm_programmers.lv0

private fun solution ( a : IntArray) : Int {
    var answer = (0..9).filterNot { a.contains(it) }.sum()

    return answer
}

fun main() {
    var testA = intArrayOf(1,2,3,4,5,6,7,8,0)
    var testB = intArrayOf(1,7,8,0)
    var testC = intArrayOf(1,2,3,7,8,0,9)
    var testD = intArrayOf(1,2,3,4,5,6,7,8,0)

    println(solution(testA))
    println(solution(testB))
    println(solution(testC))
    println(solution(testD))
}