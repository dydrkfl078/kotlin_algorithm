package programmers_lv1

private fun solution(price: Int, money: Int, count: Int): Long {
    var answer = (1..count).map {
        it * price.toLong()
    }.sum() - money
    return if ( answer > 0) answer else 0
}

fun main() {
    val testPrice = 3
    val testMoney = 20
    val testCount = 4

    println(solution(testPrice,testMoney,testCount))
}