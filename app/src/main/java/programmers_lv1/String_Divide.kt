package programmers_lv1

private fun solution(s: String): Int {
    var answer: Int = 0
    var dividor = mutableListOf<String>()

    s.forEach {
        dividor.add("$it")
        if (dividor.filter { it == dividor.first() }.size == dividor.filter { it != dividor.first() }.size){
            dividor.clear()
            answer ++
        }
    }

    return if (dividor.isNotEmpty()) answer + 1 else answer
}

fun main() {
    val testA = "aaabbaccccabba"

    println(solution(testA))
}