package programmers_lv1

private fun solution(ingredient: IntArray): Int {
    var answer: Int = 0

    var recipe = ingredient.joinToString("")

    while (true) {
        if (recipe.contains("1231")) {
            recipe = recipe.replaceFirst("1231","")
            answer++
        } else {
            break
        }
    }

    return answer
}

fun main() {
    val testA = intArrayOf(1,2,3,1,1,2,3,1,3)

    println(solution(testA))
}