package programmers_lv1

private fun solution(keymap: Array<String>, targets: Array<String>): IntArray {

    var inputCount = HashMap<Char, Int>()

    keymap.map {
        it.mapIndexed { index, char ->
            if (inputCount.containsKey(char) && inputCount[char]!! > index) {
                inputCount.put(char, index +1 )
            } else if (!inputCount.containsKey(char)){
                inputCount.put(char, index +1 )
            } else {

            }
        }
    }

    return targets.map {
        it.map {char ->
            inputCount[char] ?:-1
        }.run {
            if (this.contains(-1)) {
                -1
            } else {
                this.sum()
            }
        }
    }.toIntArray()
}

fun main() {
    val keymap = arrayOf("AA")
    val targets = arrayOf("B")

    println(solution(keymap, targets).toList())
}