package basic

private fun solution(n: Int, control: String): Int {
    var answer: Int = n
    control.forEach {
        when (it.toString()) {
            "w" -> { answer ++}
            "a" -> { answer -= 10 }
            "s" -> { answer -= 1 }
            "d" -> { answer += 10 }
        }
    }
    return answer
}

fun main() {
    val testA = 0
    val testControl = "wsdawsdassw"

    println(solution(testA,testControl))
}