package com.example.algorithm_programmers.lv1

class String_Sort2 {
    fun solution(my_string: String): String {
        var answer: String = my_string.lowercase().toCharArray().sorted().joinToString("")
        return answer
    }
}

fun main() {
    print(String_Sort2().solution("BaGqAacsS"))
}