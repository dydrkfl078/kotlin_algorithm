package programmers_lv1

private fun solution(ingredient: IntArray): Int {
    var answer = 0
    var recipe = ingredient.joinToString("")

    var making = StringBuilder()


    recipe.forEach {
        if ( it == '1' && making.takeLast(3) == "123") {
            making.delete(making.lastIndex-2,making.lastIndex+1)
            println("if ${making}")
            answer ++
        } else {
            making.append(it)
            println("else ${making}")
        }
    }

    return answer
}

fun main() {
    val testA = intArrayOf(1,2,3,1,1,2,1,2,3,1,3,1,1,2,3,1)
    val testB = intArrayOf(2, 1, 1, 2, 3, 1, 2, 3, 1)

//    println(solution(testA))
    println(solution(testB))
}