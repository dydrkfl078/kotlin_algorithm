package com.example.algorithm_programmers.lv0

private fun solution (a: Int, b: Int) : Long {
    var answer : Long = 0
    if ( a == b ) {
        answer = a.toLong()
    } else {
        val sortedNum = listOf<Int>(a,b).sorted()
        answer = (sortedNum[0].toLong()..sortedNum[1].toLong()).sum()
    }

    return answer
}

fun main() {
    var testA = listOf(1,10000000)
    var testB = listOf(6,4)
    var testC = listOf(10,20)
    var testD = listOf(10,10)

    println(solution(testA[0],testA[1]))
    println(solution(testB[0],testB[1]))
    println(solution(testC[0],testC[1]))
    println(solution(testD[0],testD[1]))
}