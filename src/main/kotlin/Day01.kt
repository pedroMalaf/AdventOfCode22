fun main(){
    part1()
    part2()
}

fun part1(){
    val input = readInput("day01")
    var biggestSum = 0
    var currentSum = 0
    input.forEach { calories ->
        if (calories.isNotEmpty())
            currentSum += calories.toInt()
        if (calories.isEmpty()){
            if (currentSum > biggestSum){
                biggestSum = currentSum
            }
            currentSum = 0
        }
    }
    println(biggestSum)
}

fun part2(){

}