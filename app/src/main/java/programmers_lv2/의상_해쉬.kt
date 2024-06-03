package programmers_lv2

private fun solution(clothes: Array<Array<String>>): Int {
    var answer = clothes.size
    val hashClothes = HashMap<String,MutableList<String>>()

    clothes.forEach {
        hashClothes[it.last()]?.add(it.first())?:hashClothes.put(it.last(), mutableListOf(it.first()))
    }

    var clothesList = hashClothes.toList().sortedByDescending { it.second.size }.toList()

//    println(testA)

    fun getResult(map: List<Pair<String,MutableList<String>>>, answer: Int = 0, r: Int = map.size, combination: Int): Int{
        if (r == 0) return answer
        val temp = map.firstNotNullOf { it.first }
//        println("all comb = ${getAllCombinations(map.toList()).filter { it.size == combination && it.first().first == temp}}")

        var case = 0
        getAllCombinations(map.toList()).filter { it.size == combination && it.first().first == temp}.forEach {
            var eachCase = 1
            it.forEach { pair ->
                if (pair.first != temp) {
                    eachCase *= pair.second.size
                }
            }
            case += eachCase
        }

//        println(hashClothes[temp]!!.size)
//        println("case = ${hashClothes[temp]!!.size*case}")
        return getResult(map.drop(1), answer + hashClothes[temp]!!.size*case, r = r - 1, combination = combination)
    }

    for (i in 2 .. clothesList.size) {
//        println("?? ${getResult(testA, combination = i)}")
        answer += getResult(clothesList, combination = i)
    }

//    println(testA)

    return answer
}

fun <T> getAllCombinations(list: List<T>): List<List<T>> {
    if (list.isEmpty()) {
        return listOf(listOf())
    }

    val head = list.first()
    val rest = list.drop(1)

    val combsWithoutHead = getAllCombinations(rest)
    val combsWithHead = combsWithoutHead.map { listOf(head) + it }

    return combsWithoutHead + combsWithHead
}


fun main() {
    // 10, 33, 44 20 = 107
    val clothes = arrayOf(arrayOf("a","green"), arrayOf("b","green"), arrayOf("c","blue"), arrayOf("d","blue"),
        arrayOf("e","pink"),arrayOf("f","brown"),arrayOf("g","brown"),arrayOf("h","brown"),arrayOf("i","brown"),arrayOf("j","brown"),
    )

    // 9, 25, 36, 10 = 80
    val clothesB = arrayOf(arrayOf("a","green"), arrayOf("c","blue"), arrayOf("d","blue"),
        arrayOf("e","pink"),arrayOf("f","brown"),arrayOf("g","brown"),arrayOf("h","brown"),arrayOf("i","brown"),arrayOf("j","brown"),
    )

//    val te = HashMap<String,String>()
//
//    te.put("2","b")
//    te.put("3","a")
//
//    println(te)
//    println(te.firstNotNullOf { it.key })
    println(solution(clothes))
}