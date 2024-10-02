package programmers_lv1

import java.time.LocalTime
import java.time.format.DateTimeFormatter

class 동영상재생기 {
    fun solution(video_len: String, pos: String, op_start: String, op_end: String, commands: Array<String>): String {
        val formatter = DateTimeFormatter.ofPattern("mm:ss")
        var position = LocalTime.of(0,pos.take(2).toInt(),pos.takeLast(2).toInt())
        val endPosition = LocalTime.of(0,video_len.take(2).toInt(),video_len.takeLast(2).toInt())
        val opStart = LocalTime.of(0,op_start.take(2).toInt(),op_start.takeLast(2).toInt())
        val opEnd =LocalTime.of(0,op_end.take(2).toInt(),op_end.takeLast(2).toInt())

        if (position.isAfter(opStart) && position.isBefore(opEnd)) {
            position = opEnd
        }

        commands.forEach {
            when(it){
                "prev" -> {
                    if (!isMin(position)) {
                        position = position.minusSeconds(10)
                    } else {
                        position = LocalTime.of(0,0,0)
                    }
                }

                "next" -> {
                    if (!isMax(position, endPosition)) {
                        position = position.plusSeconds(10)
                    } else {
                        position = endPosition
                    }
                }
            }

            if (position.equals(opStart) || position.isAfter(opStart) && position.isBefore(opEnd)) {
                position = opEnd
            }
        }

        return position.format(formatter)
    }

    private fun isMin(position: LocalTime): Boolean {
        return position.minute == 0 && position.second in 0..10
    }


    private fun isMax(position: LocalTime, endPosition:LocalTime): Boolean {
        return position.plusSeconds(10).isAfter(endPosition)
    }
}



fun main() {
    val mySolution = 동영상재생기()

//    println(mySolution.solution("55:56","00:00","15:10","15:30", arrayOf("next","next")))
    println(mySolution.solution("30:39","15:00","15:10","15:30", arrayOf("prev","next","next")))
}