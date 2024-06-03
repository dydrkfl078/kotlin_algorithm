package com.example.algorithm_programmers.lv0

private fun solution ( a: Int, b: Int, c: Int):Int {
    var answer = 1

    var numbersSize = listOf<Int>(a,b,c)
    var sameNum = numbersSize.toSet()

    when (numbersSize.size - sameNum.size) {
        0 -> { answer = a + b + c }
        1 -> { answer = (a + b + c)*(a*a+b*b+c*c)}
        2 -> { answer = (a + b + c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c)}
    }

    return answer
}

fun main() {

    var testA = listOf<Int>(3,5,5)

    println(solution(testA[0],testA[1],testA[2]))
}