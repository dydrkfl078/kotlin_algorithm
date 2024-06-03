package basic

private fun solution (n : Int): Int {
    var answer = 0
    if ( n % 2 == 1) {
        answer = (1..n step(2)).sum()
    } else {
        (0..n step(2)).forEach {
            answer += it * it
        }
    }
    return answer
}

fun main (){
    var testA = 7
    solution(testA)
}