package programmers_lv1

private fun solution(number: Int, limit: Int, power: Int): Int {
    var answer: Int = 0

    answer = (1..number).toList().map {
        it.countDividor(it,1,0).run {
            if (this > limit) {
                power
            } else {
                this
            }
        }
    }.sum()

    return answer
}

tailrec fun Int.countDividor (n: Int, factor: Int ,count: Int ): Int {
    if (n == factor) return count + 1
    if (n % factor == 0) return this.countDividor(n,factor + 1, count + 1)
    return this.countDividor(n, factor + 1, count)
}

fun main() {
    val testN = 10
    val testLimit = 3
    val testPower = 2

    println(solution(testN,testLimit,testPower))
}