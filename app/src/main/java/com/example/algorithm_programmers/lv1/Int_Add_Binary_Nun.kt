package com.example.algorithm_programmers.lv1

private fun solution(bin1: String, bin2: String): String =
    Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2))

fun main() {
    print(solution("101","11"))
}