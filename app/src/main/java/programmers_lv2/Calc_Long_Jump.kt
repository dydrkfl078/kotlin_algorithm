package programmers_lv2

private fun solution(n: Int): Long {
    var answer: Long = 0

    tailrec fun Counter(){

        return Counter()
    }
    return answer
}

// 1이 n개일 때 = 1
// 2가 1개일 때 = n-1C1
// 2가 2개일 때 = n-1C2

fun factorial(n: Int): Int {
    var answer = 1

    (1..n).forEach {
        answer *= it
    }

    return answer
}

fun comb(n: Int, r: Int):Int {
    return (factorial(n) / factorial(n-1)) / factorial(r)
}

fun main() {
    val n = 4
    val m = 3


    println("combination = ${comb(2,1)}")
    println((2000).toString(2))

    println(solution(n))
}