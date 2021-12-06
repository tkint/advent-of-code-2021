fun main() {
    val data = loadData(1).map(String::toInt)

    println(Day01.partOne(data))
    println(Day01.partTwo(data))
}

private object Day01 {
    fun partOne(data: List<Int>) = data.foldIndexed(0) { index, acc, _ ->
        if (index > 0 && data[index] > data[index - 1]) acc + 1
        else acc
    }

    fun partTwo(data: List<Int>) = data.mapIndexedNotNull { index, _ ->
        if (index < data.size - 2) data[index] + data[index + 1] + data[index + 2]
        else null
    }.let(::partOne)
}
