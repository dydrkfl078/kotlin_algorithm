package programmers_lv1

private fun solution(s: String, skip: String, index: Int): String {
    val cRange = ('a'..'z').filter { it !in skip }

    return s.map {

        println((it.code + index) % 'a'.code )
        cRange[(cRange.indexOf(it) + index) % cRange.size]
    }.joinToString("")
}

fun main() {
    val testStr = "aukks"
    val testSkip = "wbqd"
    val testIndex = 5

    println( ('{'.code - 'a'.code) % 26 )

    println(solution(testStr, testSkip, testIndex))

}