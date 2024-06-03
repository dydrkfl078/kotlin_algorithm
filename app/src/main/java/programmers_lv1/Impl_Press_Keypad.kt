package programmers_lv1

import android.R.attr.left
import android.R.attr.right


private fun solution(numbers: IntArray, hand: String): String {
    var answer = ""

    var positionLeft = 10
    var positionRight = 12

    numbers.forEach {

        when (it) {
            in 3..9 step 3 -> {
                positionRight = it
                answer += "R" }
            in 1 .. 7 step 3 -> {
                positionLeft = it
                answer += "L"
            }
            2,5,8 -> {
                val leftDistance: Int = ( Math.abs( it - positionLeft) / 3 ) + (Math.abs(it - positionLeft) % 3 )
                val rightDistance: Int = ( Math.abs( it - positionRight) / 3 ) + (Math.abs(it - positionRight) % 3 )

                if (leftDistance > rightDistance) {
                    positionRight = it
                    answer += "R"
                } else if (leftDistance < rightDistance) {
                    positionLeft = it
                    answer += "L"
                } else {
                    when(hand) {
                        "right" -> {
                            positionRight = it
                            answer += "R"
                        }
                        else -> {
                            positionLeft = it
                            answer += "L"
                        }
                    }
                }
            } else -> {
            val leftDistance: Int = ( Math.abs( 11 - positionLeft) / 3 ) + (Math.abs( 11 - positionLeft) % 3 )
            val rightDistance: Int = ( Math.abs( 11 - positionRight) / 3 ) + (Math.abs( 11 - positionRight) % 3 )

            if (leftDistance < rightDistance) {
                positionLeft = 11
                answer += "L"
            } else if (leftDistance > rightDistance) {
                positionRight = 11
                answer += "R"
            } else {
                when(hand) {
                    "right" -> {
                        positionRight = 11
                        answer += "R"
                    }
                    else -> {
                        positionLeft = 11
                        answer += "L"
                    }
                }
            }
        }
        }
    }

    return answer
}

fun main() {
    val testA = intArrayOf(1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5)

    solution(testA,"right")
}