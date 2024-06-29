package programmers_lv2

private fun solution(numbers: String): Int {
    var answer = 0

    getAllCombinations(numbers.map { it }).also { println(it.map { numbers -> numbers.joinToString("").replace(("^0+").toRegex(),"") }.toSet().drop(1)) }
    return answer
}

private fun <T> getAllCombinations(list: List<T>): Set<List<T>> {
    if (list.isEmpty()) {
        return setOf(listOf())
    }

    val head = list.first()
    val rest = list.drop(1)

    val combsWithoutHead = getAllCombinations(rest)
    val combsWithHead = combsWithoutHead.map { listOf(head) + it }

    return combsWithoutHead + combsWithHead
}

fun main() {
    val numbers = "71"

    println(solution(numbers))
}