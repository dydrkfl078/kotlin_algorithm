package programmers_lv1

private fun solution(players: Array<String>, callings: Array<String>): Array<String> {
    var playerMap = HashMap<String,Int>()
    var rankingMap = HashMap<Int,String>()

    players.mapIndexed { index, str ->
        playerMap.put(str,index + 1)
        rankingMap.put(index + 1,str)
    }.run {
        callings.map {
            var previousRank = playerMap[it] ?: 0
            var nextRank = previousRank - 1
            var subsequentPlayer = rankingMap[nextRank]!!
            println(subsequentPlayer)
            rankingMap.put(previousRank,subsequentPlayer)
            rankingMap.put(nextRank,it)
            playerMap.put(it,nextRank)
            playerMap.put(subsequentPlayer,previousRank)
        }
    }

    return rankingMap.entries.map { it.value }.toTypedArray()
}

fun main() {
    val players = arrayOf("mumu", "soe", "poe", "kai", "mine")
    val callings = arrayOf("kai", "kai", "mine", "mine")

    println(solution(players, callings))
}
