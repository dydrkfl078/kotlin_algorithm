package leetcode_medium

//You are given an integer array nums and an integer target.
//
//You want to build an expression out of nums by adding one of the symbols '+' and '-' before each integer in nums and then concatenate all the integers.
//
//For example, if nums = [2, 1], you can add a '+' before 2 and a '-' before 1 and concatenate them to build the expression "+2-1".
//Return the number of different expressions that you can build, which evaluates to target.

class TargetSum494 {
    fun findTargetSumWays(nums: IntArray, target: Int): Int {
        var answer = 0

        fun dfs(index: Int, sum: Int) {
            if (index >= nums.size) {
                if (sum == target) answer++
                return
            }

            dfs(index + 1, sum + nums[index])
            dfs(index + 1, sum - nums[index])
        }

        dfs(0, 0)

        return answer
    }
}

fun main() {

    val solution = TargetSum494()

    println(solution.findTargetSumWays(intArrayOf(1,5,3,2,5,7,9),6))
}