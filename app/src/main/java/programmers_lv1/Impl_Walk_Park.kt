package programmers_lv1

private fun solution(park: Array<String>, routes: Array<String>): IntArray {
    var location = 0 to 0
    var impedimentsLocation = HashMap<Int,List<Int>>()
    park.forEachIndexed { index, str ->
        if (str.contains("S")) {
            location = index to str.indexOf("S")
        }

        if (str.contains ("X")) {
            impedimentsLocation.put(index,str.map { it }.zip((0..str.length)).filter { it.first == 'X' }.map {
                it.second
            })
        }
    }

    fun isImpediment(type: Char, scope: Int): Boolean {
        when (type) {
            'E' -> { if (impedimentsLocation[location.first]?.filter { (location.second..location.second+scope).contains(it) }?.isNotEmpty() ?: false){ return true} }
            'W' -> { if (impedimentsLocation[location.first]?.filter { (location.second-scope..location.second).contains(it) }?.isNotEmpty() ?: false){ return true } }
            'N' -> {
                for (i in location.first - scope..location.first) {
                    if (impedimentsLocation[i]?.contains(location.second) ?:false){
                        return true
                    }
                } }
            'S' -> {
                for (i in location.first..location.first + scope) {
                    println("왜 true ? i = $i ")
                    if (impedimentsLocation[i]?.contains(location.second) ?:false){
                        return true
                    }
                }
            }
        }

        return false
    }

    routes.forEach {
        when (it.first()){
            'E' -> { if (location.second + "${it.last()}".toInt() < park[0].length && !isImpediment('E',"${it.last()}".toInt()) ) { location = location.first to location.second + "${it.last()}".toInt()} }
            'W' -> { if (location.second - "${it.last()}".toInt() >= 0 && !isImpediment('W',"${it.last()}".toInt())) { location = location.first to location.second - "${it.last()}".toInt()} }
            'N' -> { if (location.first - "${it.last()}".toInt() >= 0 && !isImpediment('N',"${it.last()}".toInt())) { location = location.first - "${it.last()}".toInt() to location.second } }
            'S' -> { if (location.first + "${it.last()}".toInt() < park.size && !isImpediment('S',"${it.last()}".toInt())) { location = location.first + "${it.last()}".toInt() to location.second } }
        }
        println(location)
    }

    println(location)

    return intArrayOf(location.first,location.second)
}

fun main() {
    val park = arrayOf("SOOXO", "OOOXO", "OXOOO", "XOOOO")
    val routes = arrayOf("E 2", "S 2", "W 2", "S 1", "W 1")

//    println((1 to 2..5).second)
    println(solution(park, routes).toList())
}