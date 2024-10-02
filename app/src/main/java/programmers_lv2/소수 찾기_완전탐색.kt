package programmers_lv2

import kotlin.math.sqrt

private fun solution(numbers: String): Int {
    var answer = 0

    // 소수 확인 로직
    fun isPrimeFactor(num: Int): Boolean {

        if (num <= 1 || num % 2 == 0) {
            return false
        }

        val max = sqrt(num.toDouble()).toInt()
        (3 .. max step 2).forEach {
            if (num % it == 0) {
                return false
            }
        }

        println("isPrimeFactor = $num")
        return true
    }

    // 모든 조합을 만드는 로직

    // '1' 과 같이 숫자 char는 toString().toInt() 또는 - '0' 을 해주면 Int형으로 사용이 가능하다.
    val intNumbers : List<Int> = numbers.map { it - '0' }
    val resultSet = mutableSetOf<Int>()

    fun dfs(prevList: MutableList<Int>, elements: List<Int>) {
        // 재귀 중단

        if (prevList.isNotEmpty()) {
            resultSet.add(prevList.toList().joinToString("").toInt())
        }

        if (elements.isEmpty()) {
            return
        }

        // 로직
        elements.forEach {
            val nextEl = elements.toMutableList()
            nextEl.remove(it)

            prevList.add(it)
            dfs(prevList, nextEl)
            prevList.removeLast()
        }
    }

    dfs(mutableListOf(),intNumbers)

    resultSet.forEach {
        if (isPrimeFactor(it)) {
            answer++
        }
    }

    return answer
}

fun main() {
    val numbers = "2"

    println("1 ==> ${solution("000000001")}")
    println("2 ==> ${solution("000000002")}")
    println("3 ==> ${solution("000000003")}")
    println("4 ==> ${solution("000000004")}")
    println("5 ==> ${solution("000000005")}")
    println("6 ==> ${solution("000000006")}")
    println("7 ==> ${solution("000000007")}")
    println("8 ==> ${solution("000000008")}")
    println("9 ==> ${solution("000000009")}")
}