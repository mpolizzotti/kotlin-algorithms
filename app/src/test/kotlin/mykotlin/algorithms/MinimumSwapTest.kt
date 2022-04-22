package mykotlin.algorithms

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class MinimumSwapTest {
    @Test
    fun `should return 5 given an array of an arrayOf(7,1,3,2,4,5,6)`(): Unit {
        val arr: Array<Int> = arrayOf(7,1,3,2,4,5,6)
        val minimumSwap: MinimumSwap = MinimumSwap()
        val actual = minimumSwap.execute(arr)
        val expected = 5
        assertEquals(expected, actual)
    }
}
