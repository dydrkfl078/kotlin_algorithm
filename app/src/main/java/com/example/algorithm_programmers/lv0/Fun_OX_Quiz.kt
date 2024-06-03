package com.example.algorithm_programmers.lv0

private fun solution(quiz: Array<String>): MutableList<String> {

    var listAnswer = mutableListOf<String>()

    val a = mutableListOf<String>()
    quiz.forEach {
        it.split(" ").forEach{ a.add(it.replace(" ","")) }

        if (a[1] == "+") {
            println(a)
            when (a.last().toInt()) {
                a[0].toInt() + a[2].toInt() -> listAnswer.add("O").also { println("O") }
                else -> listAnswer.add("X").also { println("X") }
            }
            a.clear()
        } else {
            when (a.last().toInt()) {
                a[0].toInt() - a[2].toInt() -> listAnswer.add("O").also { println("O") }
                else -> listAnswer.add("X").also { println("X") }
            }
            a.clear()
        }
    }

    return listAnswer
}

fun main() {
    val testA = arrayOf("5 + 66 = 71")

    println(solution(testA).toList())
}