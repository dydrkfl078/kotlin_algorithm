package programmers_lv2

private fun solution(n: Int): Long {
    if (n == 1) return 1
    var a = 1L
    var b = 1L
    var c = 2L
    var d = 3L
    for (i in 3..n + 1) {
        c = (a + b)%1234567
        println("a = $a b= $b c= $c d= $d")
        a = b
        b = c

    }
    return c
}

fun main() {
    println(solution(2000))
}