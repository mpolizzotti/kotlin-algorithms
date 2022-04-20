package mykotlin.algorithms

import org.junit.Test
import kotlin.test.assertEquals

class BinarySearchTest {

    private val arr: List<Int> = listOf(1, 5, 9, 13, 99, 100, 110, 130)

    @Test
    internal fun `should return an index of 6 when looking for the number 110`() {
        assertEquals(binarySearch(arr, 110), 6)
    }

    @Test
    internal fun `should return an index of 1 when looking for the number 5`() {
        assertEquals(binarySearch(arr, 5), 1)
    }

    @Test
    internal fun `should return an index of 7 when looking for the number 130`() {
        assertEquals(binarySearch(arr, 130), 7)
    }

    @Test
    internal fun `should return -1 when number is not found`() {
        assertEquals(binarySearch(arr, 2), -1)
    }
}
