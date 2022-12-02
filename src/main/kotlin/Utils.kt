import java.io.File

const val inputPath = "src/inputFiles/"

/**
 * Returns a string list from [fileName].
 */
fun readInput(fileName: String) = File(inputPath, "$fileName.txt").readLines()

/**
 * Returns an integer list from [fileName].
 */
fun readInputToInt(fileName: String) = readInput(fileName).map { it.trim().toInt() }