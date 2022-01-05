package mykotlin.algorithms

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumValueTest {
    @Test
    fun `should return 2 from intArrayOf(7, 9, 5, 2, 3)`() {
        val n = intArrayOf(7, 9, 5, 2, 3)
        assertEquals(minimumValue(n), 2)
    }

    @Test
    fun `should return 1 from intArrayOf(1, 2, 3, 4, 5)`() {
        val n = intArrayOf(1, 2, 3, 4, 5)
        assertEquals(minimumValue(n), 1)
    }
}