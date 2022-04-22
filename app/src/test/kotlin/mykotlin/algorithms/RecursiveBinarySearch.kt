package mykotlin.algorithms

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test


internal class RecursiveBinarySearch {

    private var arr: MutableList<Int> = mutableListOf()

    @BeforeEach
    fun setup() {
        arr = mutableListOf(1, 5, 9, 13, 99, 100, 110, 130)
    }

    @AfterEach
    fun teardown() {
        arr.clear()
    }

    @Test
    internal fun `should return a -1 when number cannot be found in the list`() {
        assertEquals(recursiveBinarySearch(arr, 876), -1)
    }

    @Test
    internal fun `should return an index of 0 when searching for 1 in the list`() {
        assertThat(recursiveBinarySearch(arr, 1)).isEqualTo(0)
    }

    @Test
    internal fun `should return an index of 1 when searching for 5 in the list`() {
        assertEquals(recursiveBinarySearch(arr, 5), 1)
    }

    @Test
    internal fun `should return an index of 2 when searching for 9 in the list`() {
        assertEquals(recursiveBinarySearch(arr, 9), 2)
    }

    @Test
    internal fun `should return an index of 3 when searching for 13 in the list`() {
        assertEquals(recursiveBinarySearch(arr, 13), 3)
    }

    @Test
    internal fun `should return an index of 4 when searching for 99 in the list`() {
        assertEquals(recursiveBinarySearch(arr, 99), 4)
    }

    @Test
    internal fun `should return an index of 5 when searching for 100 in the list`() {
        assertEquals(recursiveBinarySearch(arr, 100), 5)
    }

    @Test
    internal fun `should return an index of 6 when searching for 110 in the list`() {
        assertEquals(recursiveBinarySearch(arr, 110), 6)
    }

    @Test
    internal fun `should return an index of 7 when searching for 130 in the list`() {
        assertEquals(recursiveBinarySearch(arr, 130), 7)
    }
}