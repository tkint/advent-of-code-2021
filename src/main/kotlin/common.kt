import java.io.File

fun loadData(day: Int) = File("input/day${day.toString().padStart(2, '0')}.txt").readLines()

fun withInputData(day: Int, call: (data: List<String>) -> Unit) = call(loadData(day))
