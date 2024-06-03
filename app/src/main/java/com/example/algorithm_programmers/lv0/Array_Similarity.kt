package com.example.algorithm_programmers.lv0

class Array_Similarity {
    fun solution(s1: Array<String>, s2: Array<String>): Int {
        var answer: Int = 0
        for (i in s1 ) {
            for ( j in s2) {
                if (i==j) {
                    answer++
                }
            }
        }
        return answer
    }
}

class Array_Similarity2 {
    fun solution(s1: Array<String>, s2: Array<String>) : Int {
        var answer: Int = s1.filter { s2.contains(it)}.size

        return answer
    }
}

fun main() {
    val testFun = Array_Similarity()
    val testFun2 = Array_Similarity2()

    val testA : (Int) -> Unit = ::println // 메서드 참조 테스트...
    testA(testFun.solution(arrayOf("테스트","t","e"), arrayOf("t","f")))
    testA(testFun2.solution(arrayOf("1","2","3"), arrayOf("1","2","3","4","5")))
}