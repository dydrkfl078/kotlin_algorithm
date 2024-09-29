package leetcode_medium

class NumberofIslands200 (){

    fun solution(grid : Array<CharArray>): Int {

        fun dfs(i : Int, j : Int) {
            when {
                // 현재 위치가 그리드 밖이거나 섬이 아닌 경우 종료.
                ( i < 0 || i >= grid.size || j < 0 || j >= grid[0].size || grid[i][j] == '0' )
                -> return
            }

            grid[i][j] = '0'

            dfs(i,j +1)
            dfs(i,j -1)
            dfs(i-1,j )
            dfs(i+1,j )
        }

        var count = 0

        for ( i in grid.indices ) {
            for (j in grid[i].indices ) {
                if (grid[i][j] == '1') {
                    dfs(i,j)

                    count++
                    println(count)
                }
            }
        }

        return count
    }
}

fun main() {
    val grid = arrayOf(
        charArrayOf('1','1','0','0','0'),
        charArrayOf('1','1','0','0','0'),
        charArrayOf('0','0','1','0','0'),
        charArrayOf('1','1','0','0','1'),
    )

    val solution = NumberofIslands200()
    println(solution.solution(grid))
}