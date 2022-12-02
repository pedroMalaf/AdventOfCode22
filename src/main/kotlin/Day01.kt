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
    val input = readInput("day01")
    val caloriesList = mutableListOf<Int>()
    var sum = 0
    var sumOfTop3 = 0
    input.forEach { calories ->
        if (calories.isNotEmpty())
            sum += calories.toInt()
        if (calories.isEmpty()) {
            caloriesList.add(sum)
            sum = 0
        }
    }
    val sortedList = caloriesList.sortedByDescending { it }
    for (i in 0..2){
        sumOfTop3 += sortedList[i]
    }
    println(sumOfTop3)
}