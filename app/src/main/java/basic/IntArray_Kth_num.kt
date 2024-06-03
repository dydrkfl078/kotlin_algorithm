package basic

private fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
    var answer = intArrayOf()

    commands.map { command ->
        answer += array.filterIndexed { index, i -> (command[0]-1 until command[1]).contains(index) }.sorted()[command.last()-1]
    }

    println(answer.toList())
    return answer
}

fun main() {
    val testArr = intArrayOf(1,2,3,4,5,6,7)
    val com = arrayOf(intArrayOf(1,4,2), intArrayOf(2,5,4))

    solution(testArr, com)
}