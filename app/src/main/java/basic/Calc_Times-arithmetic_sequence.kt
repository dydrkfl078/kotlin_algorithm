package basic

private fun solution(a: Int, d: Int, included: BooleanArray): Int {
    var answer: Int = 0

    included.mapIndexed { index, boolean ->
        if (boolean) {
            answer += a + d.times(index)
        }
    }

    return answer
}

fun main() {
    var first = 3
    var difference = 4
    var includedA = booleanArrayOf(false,false,false,true,false,false,false,true)
    var includedB = booleanArrayOf(true,false,false,true,true)

    println(solution(first,difference,includedB))
}