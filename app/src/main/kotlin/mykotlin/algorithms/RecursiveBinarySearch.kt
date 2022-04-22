package mykotlin.algorithms

import kotlin.math.floor

internal fun recursiveBinarySearch(arr: List<Int>, num: Int, offset: Int = 0): Int {
    var startIndex = 0
    var endIndex = arr.size - 1
    var position = offset
    val middleIndex = floor((endIndex / 2).toDouble()).toInt()

    if (arr.isEmpty()) {
        return -1
    }

    if (num == arr[middleIndex]) {
        return position + middleIndex
    }

    return if (num > arr[middleIndex]) {
        startIndex = middleIndex + 1
        position += startIndex
        recursiveBinarySearch(arr.slice(startIndex..endIndex), num, offset = position)
    } else {
        endIndex = middleIndex - 1
        recursiveBinarySearch(arr.slice(startIndex..endIndex), num, offset = position)
    }
}

fun main(args: Array<String>) {
    val arr: List<Int> = listOf(1, 5, 9, 13, 99, 100, 110, 130)
    println("Solution: ${recursiveBinarySearch(arr, 2)}")
}
