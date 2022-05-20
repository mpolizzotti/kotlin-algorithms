package mykotlin.algorithms

import kotlin.math.floor

internal fun mergeSort(list: List<Int>): List<Int> {
    // When list contains a single item.
    if (list.size < 2) {
        return list
    }

    // When list contains exactly two items.
    if (list.size == 2) {
        return if (list[0] > list[1]) mutableListOf(list[1], list[0]) else list
    }

    // Find the middle, left and right side of the list.
    val middleIndex = floor(list.size/2.toDouble()).toInt()
    val leftList = list.slice(middleIndex until list.size)
    val rightList = list.slice(0 until middleIndex)

    // Recursively break lists into smaller lists.
    val leftSortedList = mergeSort(leftList)
    val rightSortedList = mergeSort(rightList)

    // Apply sort order.
    val mergedList = mutableListOf<Int>()
    var leftSortedIndex = 0
    var rightSortedIndex = 0

    while (
        leftSortedIndex < leftSortedList.size ||
        rightSortedIndex < rightSortedList.size
    ) {
        if (leftSortedIndex >= leftSortedList.size) {
            mergedList.add(rightSortedList[rightSortedIndex])
            rightSortedIndex++
        } else if (rightSortedIndex >= rightSortedList.size) {
            mergedList.add(leftSortedList[leftSortedIndex])
            leftSortedIndex++
        } else if (leftSortedList[leftSortedIndex] > rightSortedList[rightSortedIndex]) {
            mergedList.add(rightSortedList[rightSortedIndex])
            rightSortedIndex++
        } else {
            mergedList.add(leftSortedList[leftSortedIndex])
            leftSortedIndex++
        }
    }

    return mergedList
}
