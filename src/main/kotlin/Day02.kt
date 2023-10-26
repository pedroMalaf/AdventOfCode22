const val ROCK_VALUE = 1
const val PAPER_VALUE = 2
const val SCISSORS_VALUE = 3
const val WIN_VALUE = 6
const val DRAW_VALUE = 3
const val LOSS_VALUE = 0
fun main(){
    println(day2Part1())
}

fun day2Part1(): Int{
    val lines = readInput("day02")
    var totalScore = 0
    lines.forEach{line ->
        when(line[0]){
            'A' -> {
                if (line[2] == 'X') totalScore += DRAW_VALUE + ROCK_VALUE
                if (line[2] == 'Y') totalScore += WIN_VALUE + PAPER_VALUE
                if (line[2] == 'Z') totalScore += LOSS_VALUE + SCISSORS_VALUE
            }
            'B' -> {
                if (line[2] == 'X') totalScore += LOSS_VALUE + ROCK_VALUE
                if (line[2] == 'Y') totalScore += DRAW_VALUE + PAPER_VALUE
                if (line[2] == 'Z') totalScore += WIN_VALUE + SCISSORS_VALUE
            }
            else -> {
                if (line[2] == 'X') totalScore += WIN_VALUE + ROCK_VALUE
                if (line[2] == 'Y') totalScore += LOSS_VALUE + PAPER_VALUE
                if (line[2] == 'Z') totalScore += DRAW_VALUE + SCISSORS_VALUE
            }
        }
    }
    return totalScore
}

fun day2Part2(){
    TODO()
}