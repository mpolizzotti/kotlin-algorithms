package mykotlin.algorithms

import assertk.assertAll
import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class MergeSortTest {
    @Test
    internal fun `should immediately return list with single item`() {
        val list = listOf(10)

        assertAll {
            assertThat(mergeSort(list).size).isEqualTo(1)
            assertThat(mergeSort(list).first()).isEqualTo(10)
        }
    }

    @Test
    internal fun `should sort a list with only two items`() {
        val list = listOf(10, 2)

        assertAll {
            assertThat(mergeSort(list).first()).isEqualTo(2)
            assertThat(mergeSort(list).last()).isEqualTo(10)
        }
    }

    @Test
    internal fun `should return an already sorted list consisting of two items`() {
        val list = listOf(2, 10)

        assertAll {
            assertThat(mergeSort(list).first()).isEqualTo(2)
            assertThat(mergeSort(list).last()).isEqualTo(10)
        }
    }

    @Test
    internal fun `should sort a long list of integers`() {
        val list = listOf(-10, 33, 5, 10, 3, -19, -99, 100)

        assertThat(mergeSort(list)).isEqualTo(listOf(-99, -19, -10, 3, 5, 10, 33, 100))
    }
}