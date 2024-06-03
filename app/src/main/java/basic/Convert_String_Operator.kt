package basic

private fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
    var answer: Int = 0

    when (ineq) {
        ">" -> {
            when (eq) {
                "!" -> { if (n > m) {
                    answer = 1
                }}
                "=" -> { if (n >= m) {
                    answer = 1
                }}
            }
        }
        "<" -> {
            when (eq) {
                "!" -> {if (n < m) {
                    answer = 1
                }}
                "=" -> {if (n <= m){
                    answer = 1
                }}
            }
        }
    }

    return answer
}

fun main (){
    var testA = ">"
    var testB = "!"
    var testC = 41
    var testD = 78
    solution(testA,testB,testC,testD)
}