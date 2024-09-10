package leetcode_easy

class CountLagestGroup1399 {

    fun countLargestGroup(n: Int): Int {
        val groupMap = HashMap<Int, Int>()

        groupMap.putAll(
            (1..9).map {
                it to 0
            }
        )

        (1..n).forEach { num ->
            println(num)
            val sum = num.toString().map {
                it.toString()
            }.sumOf { it.toInt() }

            groupMap[sum] = groupMap[sum]?.let { it + 1 } ?: 1
        }

        println(groupMap.entries)
        return groupMap.filterValues { it == groupMap.maxOf { c -> c.value } }.size
    }
}

fun main() {
    println(CountLagestGroup1399().countLargestGroup(24))
}