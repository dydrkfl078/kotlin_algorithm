package programmers_lv1

private fun solution(str: String, n: Int): String {
    var answer = ""
    str.map {
        var unicode = it.code
        if ((97..122).contains(unicode)) {
            answer += if (unicode + n > 122) {
                (96 + (unicode + n - 122) % 25).toChar()
            } else {
                (unicode + n).toChar()
            }
        } else if ((65..90).contains(unicode)) {
            answer += if (unicode + n > 90) {
                (64 + (unicode + n - 90) % 25).toChar()
            } else {
                (unicode + n).toChar()
            }
        } else {
            answer += it
        }
    }
    return answer
}

private fun solution2(str: String, n: Int): String {
    var answer = ""
    str.map {
        answer += when (it) {
            in 'a'..'z' -> ('a'.code + (it.code + n - 'a'.code) % ('z' - 'a' + 1)).toChar()
            in 'A'..'Z' -> ('A'.code + (it.code + n - 'A'.code) % ('Z' - 'A' + 1)).toChar()
            else -> {
                it
            }
        }
    }

    return answer
}


fun main() {
    var testA = "a B z"

    println(solution2(testA, 4+26+26+26+26))
    println(solution2("AB", 1))
    println(solution2("z", 1))

    println(" ".isEmpty())
    println("".isEmpty())


    println("a B z".split("")[0])

}