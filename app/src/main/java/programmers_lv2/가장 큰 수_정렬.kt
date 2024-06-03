package programmers_lv2

private fun solution(numbers: IntArray): String {
    val strBuilder = StringBuilder()

    numbers.map { it.toString() }
        .groupBy { it.first() }
        .map {
            it.value.sortedWith(Comparator { a, b ->
                val order1 = a + b
                val order2 = b + a
                order2.compareTo(order1)
            })
        }
        .sortedByDescending { it.first() }
        .forEach { strBuilder.append(it.joinToString(""))
        }

    return if (strBuilder.toString().filterNot { it == '0' }.isEmpty()) "0" else strBuilder.toString()
}

fun main() {
    val numbers = intArrayOf(0,0,0)

    println(solution(numbers))
}