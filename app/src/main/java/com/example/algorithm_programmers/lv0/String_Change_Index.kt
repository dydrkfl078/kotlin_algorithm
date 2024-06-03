package com.example.algorithm_programmers.lv0

private class String_Change_Index {
    fun solution(my_string: String, num1: Int, num2: Int): String {
        var str= my_string.toCharArray()
        var a = str[num1]
        var b = str[num2]
        str[num1] = b
        str[num2] = a
        var answer = str.toList().joinToString("","","")
        return answer
    }
}

fun main() {
    val testFun = String_Change_Index()
    println(testFun.solution("test",2,3))
}