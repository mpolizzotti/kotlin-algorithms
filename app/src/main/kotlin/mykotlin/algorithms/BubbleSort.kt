package mykotlin.algorithms

internal fun bubbleSort(arr: List<Int>): List<Int> {
    val elementList = arr.toMutableList()

    for (outerIdx in 0 until elementList.size) {
        var outerEl = elementList[outerIdx]

        for (innerIdx in (outerIdx + 1) until elementList.size ) {
            var innerEl = elementList[innerIdx]

            // [10, 3] => [3, 10]
            if (outerEl > innerEl) {
                // Swap elements.
                elementList[outerIdx] = innerEl
                elementList[innerIdx] = outerEl

                // Update references.
                outerEl = elementList[outerIdx]
            }
        }
    }

    return elementList
}
