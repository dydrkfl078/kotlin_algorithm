package baekjoon.bronze

import java.lang.StringBuilder

fun main() {
    val n = readln().toInt()

    val starBuilder = mutableListOf<String>()
    for (i in 0 until n) {
        var a = StringBuilder()
        a.append(" ".repeat( n - i - 1),"*".repeat(i * 2 + 1),"\n")

        print(a)
        starBuilder.add(a.toString())
    }

    starBuilder.dropLast(1).reversed().forEach {
        print(it)
    }
}