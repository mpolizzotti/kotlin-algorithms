package mykotlin.algorithms

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class DiagonalDifferenceTest {
    @Test
    fun `should return 15 given the array matrix`() {
        val arr = arrayOf<Array<Int>>(
            arrayOf<Int>(11, 2, 4),
            arrayOf<Int>(4, 5, 6),
            arrayOf<Int>(10, 8, -12)
        )
        val diagonalDifference: DiagonalDifference = DiagonalDifference()
        val result = diagonalDifference.execute(arr)
        assertEquals(15, result)
    }

    @Test
    fun `should return 37 given the array matrix`() {
        val arr = arrayOf<Array<Int>>(
            arrayOf<Int>(-11, -2, 4),
            arrayOf<Int>(-4, -5, -6),
            arrayOf<Int>(10, -8, -12)
        )
        val diagonalDifference: DiagonalDifference = DiagonalDifference()
        val result = diagonalDifference.execute(arr)
        assertEquals(37, result)
    }

    @Test
    fun `should return 9 given the array matrix`() {
        val arr = arrayOf<Array<Int>>(
            arrayOf<Int>(11, 2, 4),
            arrayOf<Int>(4, 5, 6),
            arrayOf<Int>(10, 8, 12)
        )
        val diagonalDifference: DiagonalDifference = DiagonalDifference()
        val result = diagonalDifference.execute(arr)
        assertEquals(9, result)
    }
}