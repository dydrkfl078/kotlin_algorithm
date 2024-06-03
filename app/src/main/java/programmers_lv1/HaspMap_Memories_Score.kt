package programmers_lv1

private fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
    val info = HashMap<String,Int>()
    name.zip(yearning.toList()).map {
        info.put(it.first,it.second)
    }

    return photo.map {
        it.map {
            info[it]?:0
        }.sum()
    }.toIntArray()
}

fun main() {
    val name = arrayOf("may", "kein", "kain", "radi")
    val yearning = intArrayOf(5, 10, 1, 3)
    val photo = arrayOf(arrayOf("may", "kein", "kain", "radi"), arrayOf("may", "kein", "brin", "deny"),
        arrayOf("kon", "kain", "may", "coni"))

    solution(name,yearning,photo)
}