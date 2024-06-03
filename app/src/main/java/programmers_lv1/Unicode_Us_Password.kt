package programmers_lv1

private fun solution(s: String, skip: String, index: Int): String {

    return s.map {
        var i = index
        var c = it
        while (i != 0) {
            c = ((c.code + 1 - 'a'.code) % 26 + 'a'.code).toChar()
            if (!skip.contains(c)) {
                i --
            } else {
            }
        }
        c
    }.joinToString("")
}

fun main() {
    val testStr = "aukks"
    val testSkip = "wbqd"
    val testIndex = 5

    println( ('{'.code - 'a'.code) % 26 )

    println(solution(testStr, testSkip, testIndex))

}