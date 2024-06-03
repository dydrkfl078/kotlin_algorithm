package basic

private fun solution(arr: Array<String>): String {
    var answer: String = arr.joinToString("").replace(",","").replace(" ","")
    return answer
}

private fun solution2(arr: Array<String>) : String {
    var answer : String = ""
    arr.forEach { answer= answer+it }

    return answer.replace(",","")
}

private fun solution3(arr: Array<String>) : String {
    var answer : String = arr.joinToString("")
    return answer

}
fun main() {
    println(solution2(arrayOf("a,b,c")))
}