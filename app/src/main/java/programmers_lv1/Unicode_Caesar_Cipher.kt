package programmers_lv1

private fun solution (str: String, n: Int ) : String {
    var answer = ""
    str.map {
        var unicode = it.code
        if ( (97..122).contains(unicode) ) {
            answer += if (unicode + n > 122) {
                (96 + (unicode + n - 122) % 25).toChar()
            } else {
                (unicode + n ).toChar()
            }
        }  else if ((65..90).contains(unicode)) {
            answer += if (unicode + n > 90) {
                (64 + (unicode + n - 90) % 25).toChar()
            } else {
                (unicode + n ).toChar()
            }
        } else {
            answer += it
        }
    }
    return answer
}


fun main() {
    var testA = "a B z"

    println(solution(testA,4))
    println(solution("AB",1))
    println(solution("z",1))

    println(" ".isEmpty())
    println("".isEmpty())
    println("a B z".split("")[0])

}