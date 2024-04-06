package com.example.algorithm_programmers.lv1

private fun refactorSolution (strings: Array<String>, n: Int): Array<String> {
    val answer = strings.sorted().sortedBy { it[n] }.toTypedArray()
    return answer
}

private fun solution (strings: Array<String>, n: Int): Array<String> {
    var answer = mutableListOf<String>()

    var indexChar : MutableList<String> = mutableListOf<String>()
    strings.toList().chunked(1).map { strings ->
        var chars  = strings[0].chunked(1)
        var el = chars[n]

        indexChar.add(el+chars.joinToString(""))
    }
    indexChar.sorted().toMutableList().forEach {
        answer.add(it.removeRange(0 until 1))

    }

    return answer.toTypedArray()
}

fun main() {
    var testA = arrayOf("sun","bed","car")
    var testB = arrayOf("pair","fail","car")

    solution(testA,1)
    refactorSolution(testB,1)

}