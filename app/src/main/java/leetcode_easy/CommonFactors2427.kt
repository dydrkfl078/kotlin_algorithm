package leetcode_easy

class CommonFactors2427 {
    fun commonFactors(a: Int, b: Int): Int {
        var temp = 0
        return if (a % 2 == 0 ) {
            (2.. a step 2).filter {
                if (a != it && a % it == 0 && a / it % 2 != 0 && b % (a / it) == 0) {
                    println(it)
                    temp++
                }
                a % it == 0 && b % it == 0
            }.size + 1 + temp
        } else {
            (3 .. a step 2).filter {
                a % it == 0 && b % it == 0
            }.size + 1
        }
    }

    fun refactor(a: Int, b: Int): Int {
        val half = if (a==b) a else if (a>b) a/2+1 else b/2+1

        return (1..half).filter {
            a % it == 0 && b % it == 0
        }.size
    }
}

fun main() {
    val solution = CommonFactors2427()

    println(solution.refactor(12,6))

}