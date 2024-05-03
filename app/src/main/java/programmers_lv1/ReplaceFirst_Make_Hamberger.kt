package programmers_lv1

private fun solution(ingredient: IntArray): Int {
    var recipe = ingredient.joinToString("")

    while (true) {
        if (recipe.contains("1231")) {
            recipe = recipe.replace("1231","")
        } else {
            break
        }
    }

    return ( ingredient.size - recipe.length ) / 4
}

fun main() {
    val testA = intArrayOf(1,2,3,1,1,2,1,2,3,1,3,1,1,2,3,1)
    val testB = intArrayOf(1, 2, 3, 2, 1, 2, 3, 1, 1)

    println(solution(testA))
    println(solution(testB))
}