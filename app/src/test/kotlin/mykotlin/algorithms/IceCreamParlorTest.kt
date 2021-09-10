package mykotlin.algorithms

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.expect

class IceCreamParlorTest {
    @Test
    fun `should return indices of 1,4`(): Unit {
        val m: Int = 6
        val arr: Array<Int> = arrayOf(1,3,4,5,6)
        val iceCreamParlor: IceCreamParlor = IceCreamParlor()
        val actual: Array<Int> = iceCreamParlor.execute(m, arr)
        val expected: Array<Int> = arrayOf(1,4)
        assertEquals(actual[0], expected[0])
        assertEquals(actual[1], expected[1])
        assertEquals(actual.size, expected.size)
    }
}
