package mykotlin.algorithms

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class MaxProfitTest {
    @Test
    fun `should return 5 for intArrayOf(7,1,5,3,6,4)`() {
        val prices = intArrayOf(7,1,5,3,6,4)
        assertEquals(maxProfit(prices), 5)
    }

    @Test
    fun `should return 0 for intArrayOf(7,6,4,3,1)`() {
        val prices = intArrayOf(7,6,4,3,1)
        assertEquals(maxProfit(prices), 0)
    }
}