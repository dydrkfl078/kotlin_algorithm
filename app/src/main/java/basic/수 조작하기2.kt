package basic

class 수조작하기Two {
    fun solution(numLog: IntArray): String {
        var answer = StringBuilder()

        for (i in 1 until numLog.size ) {
            answer.append(
                when(numLog[i]-numLog[i-1]) {
                    1 -> "w"
                    -1 -> "s"
                    10 -> "d"
                    -10 -> "a"
                    else -> ""
                })
        }

        return answer.toString()
    }
}