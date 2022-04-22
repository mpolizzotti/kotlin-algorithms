package mykotlin.algorithms

import kotlin.math.floor

internal fun binarySearch(arr: List<Int>, num: Int): Int {
    var startIndex = 0
    var endIndex = arr.size - 1

    while (startIndex <= endIndex ) {
        val middleIndex = floor((startIndex + ((endIndex - startIndex) / 2)).toDouble()).toInt()

        if (num == arr[middleIndex]) {
            return middleIndex
        }

        if (num > arr[middleIndex]) {
            startIndex = middleIndex + 1
        } else {
            endIndex = middleIndex - 1
        }
    }

    return -1
}

