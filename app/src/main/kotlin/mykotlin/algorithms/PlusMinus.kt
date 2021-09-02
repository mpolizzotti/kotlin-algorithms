package mykotlin.algorithms

import java.math.BigDecimal
import java.math.RoundingMode

class PlusMinus() {
    fun execute(arr: Array<Int>): HashMap<String, BigDecimal> {
        val length: Int = arr.size
        var positive: Int = 0
        var negative: Int = 0
        var zero: Int = 0

        for (i in arr.indices) {
            val num: Int = arr[i]
            if (num < 0) {
                negative += 1
            } else if (num == 0) {
                zero += 1
            } else {
                positive += 1
            }
        }

        val positiveRatio: BigDecimal = positive.toBigDecimal().divide(length.toBigDecimal(), 6, RoundingMode.HALF_UP)
        val negativeRatio: BigDecimal = negative.toBigDecimal().divide(length.toBigDecimal(), 6, RoundingMode.HALF_UP)
        val zeroRatio: BigDecimal = zero.toBigDecimal().divide(length.toBigDecimal(), 6, RoundingMode.HALF_UP)

        println(positiveRatio)
        println(negativeRatio)
        println(zeroRatio)

        val resultMap: HashMap<String, BigDecimal> = HashMap()
        resultMap["positiveRatio"] = positiveRatio
        resultMap["negativeRatio"] = negativeRatio
        resultMap["zeroRatio"] = zeroRatio

        return resultMap
    }
}

fun main(args: Array<String>) {
    val arr = arrayOf<Int>(-4, 3, -9, 0, 4, 1)
    val plusMinus: PlusMinus = PlusMinus()
    plusMinus.execute(arr)
}