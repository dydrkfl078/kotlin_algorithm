package leetcode_medium

class Permutations46 {
    fun permute(nums: IntArray): List<List<Int>> {
        val answer = mutableListOf<MutableList<Int>>()

        fun dfs(prevEl: MutableList<Int>, el: List<Int>) {

            // 중단
            if (el.isEmpty()) {
                answer.add(prevEl.toMutableList())
                return
            }

            // 작동
            el.forEach {
                val nextEl = el.toMutableList().apply {
                    this.remove(it)
                }
                prevEl.add(it)
                println(prevEl)
                dfs(prevEl, nextEl)
                prevEl.remove(it)
            }
        }

        dfs(mutableListOf(), nums.toList())

        return answer
    }
}