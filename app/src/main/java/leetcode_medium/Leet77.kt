package leetcode_medium

//Given two integers n and k, return all possible combinations of k numbers chosen from the range [1, n].
//
//You may return the answer in any order.


class Leet77 {
    fun combine(n: Int, k: Int): List<List<Int>> {
        val answer = mutableListOf<List<Int>>()

        fun dfs(el: MutableList<Int>, start: Int, k: Int){
            if (k == 0) {
                answer.add(el)
                return
            }

            (start .. n).forEach {
                el.add(it)
                dfs(el, it + 1, k - 1)
                el.removeLast()
            }
        }

        dfs(mutableListOf(),1,k)

        return answer
    }
}