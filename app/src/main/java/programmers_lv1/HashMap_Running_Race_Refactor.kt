package programmers_lv1

private fun solution(players: Array<String>, callings: Array<String>): Array<String> {
    var playerMap = HashMap<String, Int>()

    players.mapIndexed { index, str ->
        playerMap.put(str, index)
    }

    callings.map {
        val previousRank = playerMap[it]!!

        players[previousRank] = players[previousRank - 1]
        players[previousRank - 1] = it
        playerMap.put(it, previousRank - 1)
        playerMap.put(players[previousRank], previousRank)
    }

    return players
}

fun main() {
    val players = arrayOf("mumu", "soe", "poe", "kai", "mine")
    val callings = arrayOf("kai", "kai", "mine", "mine")

    println(solution(players, callings).toList())
}
