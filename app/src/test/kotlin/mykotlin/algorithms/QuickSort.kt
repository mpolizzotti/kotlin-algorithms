package mykotlin.algorithms

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class QuickSort {
    @Test
    internal fun `should sort the array in ascending order`() {
        val list = listOf(-3, 10, 1, 100, -10, 22, 15)
        val sortedList = listOf(-10, -3, 1, 10, 15, 22, 100)
        assertThat(quickSort(list)).isEqualTo(sortedList)
    }
}