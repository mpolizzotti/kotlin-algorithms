package mykotlin.algorithms

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

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