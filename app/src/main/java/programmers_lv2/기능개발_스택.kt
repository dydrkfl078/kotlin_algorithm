package programmers_lv2

import java.util.Stack

private fun solution(progresses: IntArray, speeds: IntArray): IntArray {
    var answer = intArrayOf()
    var stack = Stack<Pair<Int,Int>>()

    progresses.zip(speeds).reversed().forEach {
        stack.push(it)
    }

    var n = 0
    while (stack.isNotEmpty()) {
        when {
            stack.peek().first >= 100 -> {
                stack.pop()
                n++
                println("?? = $n")
            }
            else -> {
                println("!! = $n")
                if (n > 0){ answer += n
                n = 0
                }
                var a = Stack<Pair<Int,Int>>()
                a.addAll(stack.map { it.first + it.second to it.second })
                stack = a
                println(stack)
            }
        }
    }
    answer += n

    return answer
}

fun main() {
    val progresses = intArrayOf(93, 30, 55)
    val speeds = intArrayOf(1, 30, 5)

    println(solution(progresses, speeds).toList())
}