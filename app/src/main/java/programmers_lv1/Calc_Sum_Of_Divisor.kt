package programmers_lv1

private fun solution ( n : Int ) : Int {
    var answer = 0

    for (i in 1 ..n) {
        if (n % i == 0) {
            answer += i
        }
    }

    return answer
}

fun main() {
    val testA = 12

    println(solution(testA))
}