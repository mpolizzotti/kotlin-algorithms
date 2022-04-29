package mykotlin.algorithms

internal fun quickSort(list: List<Int>): List<Int> {
    val copied = list.toMutableList()

    if (copied.size <= 1) {
        return copied
    }

    val pivotElement = copied.removeFirst()
    val smallerElementList = mutableListOf<Int>()
    val biggerElementList = mutableListOf<Int>()
    val centerElementList = mutableListOf<Int>(pivotElement)

    while (copied.size != 0) {
        val currentElement = copied.removeFirst()
        if (currentElement == pivotElement) {
            centerElementList.add(currentElement)
        } else if (currentElement < pivotElement) {
            smallerElementList.add(currentElement)
        } else {
            biggerElementList.add(currentElement)
        }
    }

    val smallerSortedElementsList = quickSort(smallerElementList)
    val centerSortedElementsList = quickSort(centerElementList)
    val biggerSortedElementsList = quickSort(biggerElementList)

    return listOf(
        smallerSortedElementsList,
        centerSortedElementsList,
        biggerSortedElementsList,
    ).flatten()
}

fun main(args: Array<String>) {
    val list = listOf(-3, 10, 1, 100, -10, 22, 15)
    println("QuickSort: ${quickSort(list)}")
}