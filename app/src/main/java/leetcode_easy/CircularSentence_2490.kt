
class CircularSentence_2490 {

    private fun isCircularSentence(sentence: String): Boolean {

        tailrec fun find(prevChar: Char , strList: List<String>, count : Int = 0) : Boolean {

            return if (count == strList.size) true
            else if (prevChar != strList[count].first()) return false
            else find(strList[count].last(),strList,count+1)
        }

        val sentences = sentence.split(" ")

        return find(sentences.last().last(),sentences)
    }

    fun main (){
        isCircularSentence("MuFoevIXCZzrpXeRmTssj lYSW U jM")
    }

}