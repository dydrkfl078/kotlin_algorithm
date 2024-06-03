package programmers_lv1

private fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {

    return goal.partition {
        cards1.contains(it)
    }.run {
        val card1words = this.first.joinToString("")
        val card2words = this.second.joinToString("")
        if ( card1words == cards1.joinToString("").substring(0,card1words.length)
            && card2words == cards2.joinToString("").substring(0,card2words.length)){
                "Yes"
        } else {
            "No"
        }
    }
}

fun main() {
    val cards1 = arrayOf("a", "b", "c", "d", "e", "f", "g", "h", "i", "j")
    val cards2 = arrayOf("string", "or", "integer")
    val goal = arrayOf("string", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j")

    println(solution(cards1,cards2,goal))
}