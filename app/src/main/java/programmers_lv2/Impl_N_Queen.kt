package programmers_lv2

private fun solution(n: Int): Int {
    var answer = 0


    fun nQueen(start: Int, queen: MutableList<Int> = mutableListOf(), inclination: MutableList<Float>, answer : Int = 0){
        if (queen.size != n) return nQueen(start + 1, queen, mutableListOf<Float>(), answer + 1)

        return nQueen(start, queen, inclination, answer)
    }

    var coordinate = mutableListOf<BooleanArray>()
    for (i in 1 .. n) {
        coordinate.add(BooleanArray(n))
    }

    coordinate.forEach { println(it.toList()) }

    return answer
}


fun main() {
    val n = 4

    println(solution(n))
}