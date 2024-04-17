package programmers_lv1

// LSM = Least Common Multiple 최소 공배수 , GSD = Greatest Common Divisor
fun solution(n: Int, m: Int): LongArray {
    var numbers = intArrayOf(n,m).sorted()

    tailrec fun gcd(a: Int, b: Int): Int {
        if (b == 0) return a
        return gcd(b, a % b)
    }

    val GCD = gcd(numbers[0],numbers[1])
    val LCM = m.toLong() * n.toLong() / GCD
    val answer = longArrayOf(GCD.toLong(), LCM)
    return answer
}

fun main() {
    val testA = 4
    val testB = 7
    val testC = 999999
    val testD = 1000000

    println("? = ${7 % 4}")
    println(solution(testA,testB).toList())
    println(solution(testC,testD).toList())
}