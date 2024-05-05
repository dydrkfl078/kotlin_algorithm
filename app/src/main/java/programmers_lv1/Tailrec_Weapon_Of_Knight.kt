package programmers_lv1

import kotlin.math.sqrt

private fun solution(number: Int, limit: Int, power: Int): Int {

    return (1..number).map {
        var n = it
        val primeFactor = mutableSetOf<Int>(1,n)

        for (i in 1..sqrt(n.toDouble()).toInt()) {
            if (n % i == 0) {
                primeFactor.add(i)
                primeFactor.add(n/i)
            }
        }

        println(primeFactor.sorted())
        if (primeFactor.size > limit) {
            power
        } else {
            primeFactor.size
        }
    }.sum()
}


fun main() {
    val testN = 100000
    val testLimit = 50
    val testPower = 25

//    println(sqrt((29).toDouble()).toInt())
    println(solution(testN, testLimit, testPower))
    println(sqrt((12).toDouble()).toInt())
}