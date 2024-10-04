package programmers_lv2

import kotlin.math.sqrt

class 카펫 {
    fun solution(brown: Int, yellow: Int): IntArray {

        (1..sqrt(yellow.toDouble()).toInt()).forEach {
            if (yellow % it == 0) {

                if ((yellow / it * 2) + (it * 2) + 4 == brown) {
                    return intArrayOf(yellow / it + 2, it + 2)
                }
            }

        }

        return intArrayOf()


//        y = 24
//        ty = 1 24, 1--> 48+2+4 [b == 54] 26,3
//        ty = 2 12, 2--> 24+4+4 [b == 32] 14,4
//        ty = 3 8, 3--> 16, 6+4 [b == 26] 10,5
//        ty = 4 6, 4--> 12+8+4 [b == 24]
//        ty = 5 X
    }
}

fun main() {
    val solution = 카펫()
    println(solution.solution(20,7).toList())
}