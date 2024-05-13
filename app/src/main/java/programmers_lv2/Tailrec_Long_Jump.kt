package programmers_lv2

private fun solution(n: Int): Long {
    var answer: Long = 0

    tailrec fun counter(q: Long, r: Long){
        if (q < r ) return
        if (q >= r) answer += comb(q,r)
        return counter(q - 1, r + 1)
    }

    counter(n.toLong(), 0)

    return answer % 1234567
}

// 1이 n개일 때 = 1
// 2가 1개일 때 = n-1C1
// 2가 2개일 때 = n-1C2

fun factorial(n: Long): Long {
    var answer = 1L

    (1..n).forEach {
        answer *= it
    }

    return answer
}

fun comb(n: Long, r: Long):Long {
    return (factorial(n) / factorial(n-r)) / factorial(r)
}

fun main() {
    val n = 100
    val m = 3

//    println(factorial(10))
//    println("${comb(65,0)}")
//    // r이 3일땐 ?
//    println("r3이 3일 땐???")
//    println("combination 다1일 경우= ${comb(4,3)}") // n = 7 출력 : 4
//    println("combination 다1일 경우= ${comb(5,3)}") // n = 8 출력 : 10
//    println("combination 다1일 경우= ${comb(6,3)}") // n = 9 출력 : 20
//    println("combination 다1일 경우= ${comb(7,3)}") // n = 10 출력 : 35
//    println("combination 다1일 경우= ${comb(8,3)}") // n = 11 출력 : 56
//    println("combination 다1일 경우= ${comb(9,3)}") // n = 12 출력 : 84
////    println((2000).toString(2))
//
//    // n이 4일때
//    println("n이 4일 땐???")
//    println("combination 다1일 경우= ${comb(2,2)}") // n = 4 출력 : 1
//    println("combination 다1일 경우= ${comb(3,1)}") // n = 4 출력 : 3
//    println("combination 다1일 경우= ${comb(4,0)}") // n = 4 출력 : 1
//
//    // n이 5일때
//    println("n이 5일 땐???")
//    println("combination 다1일 경우= ${comb(3,2)}") // n = 5 출력 : 3
//    println("combination 다1일 경우= ${comb(4,1)}") // n = 5 출력 : 4
//    println("combination 다1일 경우= ${comb(5,0)}") // n = 5 출력 : 1
//
//    // n이 3일때
//    println("n이 4일 땐???")
//    println("combination 다1일 경우= ${comb(2,1)}") // n = 3 출력 : 2
//    println("combination 다1일 경우= ${comb(3,0)}") // n = 3 출력 : 1
//
//    // 즉 nCr 일 때, n + r이 number로 유지되도록 n - 1 , r + 1 반복문을 돌리고, r은 n을 넘을 수 없다
//    println("combination 다1일 경우= ${comb(4,2)}") // n = 6 출력 : 6
//    println("combination 다1일 경우= ${comb(5,2)}") // n = 7 출력 : 10
//    println("combination 다1일 경우= ${comb(6,2)}") // n = 8 출력 : 15
//    println("combination 다1일 경우= ${comb(7,2)}") // n = 9 출력 : 21
//    println("combination 다1일 경우= ${comb(8,2)}") // n = 10 출력 : 28
//    println("combination 다1일 경우= ${comb(9,2)}") // n = 11 출력 : 36


//    println(solution(n))
}