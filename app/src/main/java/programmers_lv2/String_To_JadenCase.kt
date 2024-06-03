package programmers_lv2

private fun solution(s: String): String {

    return s.split(" ").joinToString(" ") { word ->
        if (word.isNotEmpty()) word.lowercase().replaceFirstChar { it.uppercase() } else ""
    }
}
fun main() {
    val s = "3people people llowed me"
    println(solution(s))
}