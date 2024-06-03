package programmers_lv1

private fun solution(num: Int): Int {
    var answer = longArrayOf()
    var n = num.toLong()

    while ( n != 1L ) {
        if ( n % 2L == 0L ){
            n /= 2
        } else {
            n = n * 3 +1
        }

        answer += n
        if (answer.size > 499) {
            return -1
        }
    }
    return answer.count()
}

fun main() {
    val testA = 626331
//    val testB = 16
//    val testC = 6

    println(solution(testA))
//    println(solution(testB))
//    println(solution(testC))
}