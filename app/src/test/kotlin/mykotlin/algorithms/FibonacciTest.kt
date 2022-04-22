package mykotlin.algorithms

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class FibonacciTest {
    @Test
    fun `should return 1 for 0`() {
        assertEquals(fibonacci(0), 1)
    }

    @Test
    fun `should return 1 for 1`() {
        assertEquals(fibonacci(1), 1)
    }

    @Test
    fun `should return 2 for 2`() {
        assertEquals(fibonacci(2), 2)
    }

    @Test
    fun `should return 3 for 3`() {
        assertEquals(fibonacci(3), 3)
    }

    @Test
    fun `should return 5 for 4`() {
        assertEquals(fibonacci(4), 5)
    }

    @Test
    fun `should return 8 for 5`() {
        assertEquals(fibonacci(5), 8)
    }
}