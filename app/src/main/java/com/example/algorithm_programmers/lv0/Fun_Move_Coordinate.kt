package com.example.algorithm_programmers.lv0

private fun solution(keyinput: Array<String>, board: IntArray): IntArray {
    var position = intArrayOf(0, 0)
    var boardRangeX: Int = (board[0] + 1 ) / 2
    var boardRangeY: Int = (board[1] + 1 ) / 2
    for (index in keyinput) {
        println(index)
        when (index) {
            "left" -> if ( position[0] - 1 != -boardRangeX ) { position[0] -= 1}
            "right" -> if ( position[0] + 1 != boardRangeX ) { position[0] += 1}
            "up" -> if ( position[1] + 1 != boardRangeY ) { position[1] += 1}
            "down" -> if ( position[1] - 1 != -boardRangeY ) { position[1] -= 1 }

        }
    }

    return position
}

fun main() {
    val testA = arrayOf("down","down","down","down","down","right","right","right",)
    val testB = arrayOf("down","right","right")
    solution(testA, intArrayOf(7, 9)).forEach {
        println(it)
    }
}