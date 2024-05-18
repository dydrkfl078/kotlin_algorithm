package programmers_lv1

private fun solution(friends: Array<String>, gifts: Array<String>): Int {
    val giftHistory = HashMap<String,Pair<Int,Int>>()

    friends.map {
        giftHistory.put(it, 0 to 0)
    }

    gifts.map {
        it.split(" ").run {
            giftHistory.put(this.first(),giftHistory[this.first()]!!.first + 1 to giftHistory[this.first()]!!.second)
            giftHistory.put(this.last(),giftHistory[this.last()]!!.first to giftHistory[this.last()]!!.second + 1)
        }
    }

    println(giftHistory)

    return 0
}

fun main() {
    val friends = arrayOf("joy", "brad", "alessandro", "conan", "david")
    val gifts = arrayOf("alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david")

    println(solution(friends, gifts))
}