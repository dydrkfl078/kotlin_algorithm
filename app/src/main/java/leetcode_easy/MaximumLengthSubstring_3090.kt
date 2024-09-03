package leetcode_easy

class MaximumLengthSubstring_3090 {
    fun maximumLengthSubstring(s: String): Int {
        var maxLength = 0

        s.forEachIndexed { index, c ->
            var temp = "$c"
            for (i in index + 1 until s.length) {
                println(temp)
                if (temp.count { it == s[i] } > 1) {
                    if (maxLength < temp.length) {
                        maxLength = temp.length
                    }
                    temp = ""
                }
                temp += s[i]
            }
            if (maxLength < temp.length) {
                maxLength = temp.length
            }
            println(temp)
        }


        return maxLength
    }
}

fun main() {
    println(MaximumLengthSubstring_3090().maximumLengthSubstring("bcbbbcba"))
}