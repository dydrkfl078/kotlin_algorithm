package basic

private fun solution ( str: String): Boolean {
    var answer =  !str.contains("[a-z]".toRegex()) && !str.contains("[A-Z]".toRegex()) && str.length == 4 || !str.contains("[a-z]".toRegex()) && !str.contains("[A-Z]".toRegex()) && str.length == 6
    return answer
}

fun main() {
    var testA = "a123"
    var testB = "1234"
    var testC = "12341"
    var testD = "123411"
    var testE = "FFGG11"

    println(solution(testA))
    println(solution(testB))
    println(solution(testC))
    println(solution(testD))
    println(solution(testE))
}