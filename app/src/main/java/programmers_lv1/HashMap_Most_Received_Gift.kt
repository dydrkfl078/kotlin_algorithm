package programmers_lv1

private fun solution(friends: Array<String>, gifts: Array<String>): Int {
    val giftIndices = HashMap<String, Pair<Int, Int>>()
    val expactToReceive = HashMap<String, MutableSet<String>>()

    friends.map {
        giftIndices.put(it, 0 to 0)
        expactToReceive.put(it, mutableSetOf())
    }

    gifts.map {
        var giverAndReceiver = it.split(" ")

        val giverIndices = giftIndices[giverAndReceiver.first()]!!
        val receiverIndices = giftIndices[giverAndReceiver.last()]!!
        giftIndices.put(giverAndReceiver.first(), giverIndices.first + 1 to giverIndices.second)
        giftIndices.put(giverAndReceiver.last(), receiverIndices.first to receiverIndices.second + 1)

        giverAndReceiver
    }.run {
        friends.map { str ->
            friends.groupBy { if (it == str) "giver" else "receiver" }["receiver"]!!.map { friend ->
//                println("str = $str friend = $friend")
//                println("${this.count { it.first() == str && it.last() == friend }}")
//                println("${this.count { it.last() == str && it.first() == friend }}")

                if(this.count { it.first() == str && it.last() == friend } == this.count { it.last() == str && it.first() == friend }) {
                    if (giftIndices[str]!!.first - giftIndices[str]!!.second > giftIndices[friend]!!.first - giftIndices[friend]!!.second) {
                        expactToReceive[str]!!.add(friend)
                    } else if (giftIndices[str]!!.first - giftIndices[str]!!.second < giftIndices[friend]!!.first - giftIndices[friend]!!.second) {
                        expactToReceive[friend]!!.add(str)
                    } else { 
//                        println("이도저도아님")
                    }
                } else if (this.count { it.first() == str && it.last() == friend } > this.count { it.last() == str && it.first() == friend }) {
                    expactToReceive[str]!!.add(friend)
                } else { }
            }
        }
    }

    println(expactToReceive)
//
//    println(giftIndices.maxBy { it.value.first })

    return expactToReceive.maxByOrNull { it.value.count() }!!.value.count()
}

fun main() {
    val friends = arrayOf("a", "b", "c")
    val gifts = arrayOf("a b", "b a", "c a", "a c", "a c", "c a")



    println(solution(friends, gifts))

    val array = intArrayOf(64, 34, 25, 12, 22, 11, 90)
    println("Unsorted array: ${array.joinToString(", ")}")

    bubbleSort(array)

    println("Sorted array: ${array.joinToString(", ")}")
}

fun bubbleSort(array: IntArray) {
    val n = array.size
    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) {
            if (array[j] > array[j + 1]) {
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
            }
        }
    }
}

