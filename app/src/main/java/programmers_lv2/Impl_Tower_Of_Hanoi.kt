package programmers_lv2

import java.util.Stack

private fun solution(n: Int): Array<IntArray> {
    var answer = arrayOf<IntArray>()

    fun towerOfHanoi(n: Int, start: Int = 1, sub: Int = 2, end : Int = 3){
        if ( n == 0 ) return

        towerOfHanoi(n-1, start, end, sub)
        answer += intArrayOf(start,end)
        answer.toList().forEach { println("test : ${it.toList()}") }
        towerOfHanoi(n-1, sub, start, end)

    }

    towerOfHanoi(n)

    return answer
}

fun main() {
    val n = 1

    solution(n).toList().forEach {
        println(it.toList())
    }
}