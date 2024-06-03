package basic

private fun solution(my_string: String, overwrite_string: String, s: Int): String {
    var answer: String = my_string.replaceRange(s .. s+overwrite_string.length-1,overwrite_string)
    return answer
}

fun main() {
    var testA = "He11oWor1d"
    var testB = "lloWorl"

    println(solution(testA,testB,2))
}