package programmers_lv1

private fun solution(food: IntArray): String {
    var answer = StringBuilder()

    food.map { it/2 }.run {
        this.forEachIndexed { index, i ->
            answer.append("$index".repeat(i))
        }
        answer.append(answer.reversed())

        answer.insert((answer.lastIndex + 1)/2, "0")
    }

    return answer.toString()
}

fun main() {
    val testA = intArrayOf(1, 3, 1, 6)

    println(solution(testA))
}