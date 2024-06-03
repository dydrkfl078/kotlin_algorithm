package baekjoon.bronze

fun main () {
    val chessPieceSet = readln()

    chessPieceSet.split(" ").forEachIndexed { index, piece ->
        when(index) {
            0 -> print("${1-piece.toInt()} ")
            1 -> print("${1-piece.toInt()} ")
            2 -> print("${2-piece.toInt()} ")
            3 -> print("${2-piece.toInt()} ")
            4 -> print("${2-piece.toInt()} ")
            5 -> print("${8-piece.toInt()}")
        }
    }
}