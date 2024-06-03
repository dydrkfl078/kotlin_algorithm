package programmers_lv1

private fun solution(n: Int): Int {

    tailrec fun minRemainder1(n: Int, x: Int): Int {
        if (n % x == 1) return x
        return minRemainder1(n, x + 1)
    }
    return minRemainder1(n,1)
}

fun main() {
    val testA = 10
    val testB = 12

    println(solution(testA))
    println(solution(testB))
}