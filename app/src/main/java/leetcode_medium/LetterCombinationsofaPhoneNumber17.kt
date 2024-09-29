package leetcode_medium

class LetterCombinationsofaPhoneNumber17 {
    fun letterCombinations(digits: String): List<String> {
        var answer = mutableListOf<String>()

        val keyPad = hashMapOf<Char, CharArray>(
            '2' to charArrayOf('a','b','c'),
            '3' to charArrayOf('d','e','f'),
            '4' to charArrayOf('g','h','i'),
            '5' to charArrayOf('j','k','l'),
            '6' to charArrayOf('m','n','o'),
            '7' to charArrayOf('p','q','r','s'),
            '8' to charArrayOf('t','u','v'),
            '9' to charArrayOf('w','x','y','z'),
        )

        fun dfs(letter: String, seq: Int) {
            // 제약
            if (seq >= digits.length) {
                answer.add(letter)
                return
            }

            // 로직
            val pad = keyPad[digits[seq]]!!

            for (i in pad.indices) {
                dfs(letter + pad[i], seq + 1)
            }
        }

        if (digits.isNotBlank()) {
            dfs("",0)
        }

        return answer
    }
}