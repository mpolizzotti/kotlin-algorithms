package mykotlin.algorithms

import kotlin.test.Test
import kotlin.test.assertEquals

class IsPrimeTest {
    @Test
    fun `should return false for 0`() {
        assertEquals(isPrime(0), false)
    }

    @Test
    fun `should return false for 1`() {
        assertEquals(isPrime(1), false)
    }

    @Test
    fun `should return true for 2`() {
        assertEquals(isPrime(2), true)
    }

    @Test
    fun `should return true for 3`() {
        assertEquals(isPrime(3), true)
    }

    @Test
    fun `should return false for 4`() {
        assertEquals(isPrime(4), false)
    }

    @Test
    fun `should return true for 2285477`() {
        assertEquals(isPrime(2285477), true)
    }

    @Test
    fun `should return true for 9734603`() {
        assertEquals(isPrime(9734603), true)
    }

    @Test
    fun `should return true for 4718509`() {
        assertEquals(isPrime(4718509), true)
    }
}