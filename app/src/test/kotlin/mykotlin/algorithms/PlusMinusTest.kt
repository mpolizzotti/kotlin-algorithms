package mykotlin.algorithms

import java.math.BigDecimal
import java.math.MathContext
import kotlin.test.Test
import kotlin.test.assertEquals

class PlusMinusTest {
    @Test
    fun `should return an object with positive, negative and zero ratios given the array matrix`() {
        val arr: Array<Int> = arrayOf(-4,3,-9,0,4,1)
        val plusMinus: PlusMinus = PlusMinus()

        val expectedPositiveRatio: String = "0.500000"
        val expectedNegativeRatio: String = "0.333333"
        val expectedZeroRatio: String = "0.166667"
        val expectedMap: HashMap<String, BigDecimal> = plusMinus.execute(arr)

        assertEquals(expectedMap.isNotEmpty(), true)
        assertEquals(expectedMap["positiveRatio"].toString(), expectedPositiveRatio)
        assertEquals(expectedMap["negativeRatio"].toString(), expectedNegativeRatio)
        assertEquals(expectedMap["zeroRatio"].toString(), expectedZeroRatio)
    }
}