package mykotlin.algorithms

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class BubbleSortTest {
    @Test
    internal fun `should return a sorted list`() {
        val list = listOf(10, 3, 5, -3, 48, 33, 99)
        val sorted = listOf(-3, 3, 5, 10, 33, 48, 99)
        assertThat(bubbleSort(list)).isEqualTo(sorted)
    }
}