package mykotlin.algorithms

import kotlin.test.Test
import kotlin.test.assertEquals

class IsEvenTest {
    @Test
    fun `should return true for 2`() {
        assertEquals(isEven(2), true)
    }

    @Test
    fun `should return false for 3`() {
        assertEquals(isEven(3), false)
    }
}