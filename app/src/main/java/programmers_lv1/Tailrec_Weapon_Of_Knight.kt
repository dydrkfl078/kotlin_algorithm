package programmers_lv1

private fun solution(number: Int, limit: Int, power: Int): Int {
    var answer = 0
//    tailrec fun Int.countDividor (n: Int, factor: Int ,count: Int ): Int {
//        if (n == factor || count > limit) return count + 1
//        if (n % factor == 0) return this.countDividor(n,factor + 1, count + 1)
//        return this.countDividor(n, factor + 1, count)
//    }


    return (1..number).map {
        var n = it
        val primeFactor = mutableListOf<Int>(1)

        while (n % 2 == 0) {
            primeFactor.add(n)
            n /= 2
        }

        (3..Math.sqrt(n.toDouble()).toInt() step 2).forEach { odd ->
            while (n % odd == 0) {
                primeFactor.add(n)
                n /= odd
            }
        }

        if (n > 2) {
            primeFactor.add(n)
        }

        println(primeFactor.sorted())

        if (primeFactor.count() > limit) {
            limit
        } else {
            primeFactor.count()
        }
    }.sum()
}


fun main() {
    val testN = 10
    val testLimit = 3
    val testPower = 2

    println(solution(testN, testLimit, testPower))
}