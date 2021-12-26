package mykotlin.algorithms

fun maxProfit(prices: IntArray): Int {
    // Assign the variable, the maximum value that data type can hold.
    // Java provides constants to represent this number so we don't have to rem
    // Remembering such a large and precise number comes out to be a difficult job.
    // Therefore, Java has constants to represent these numbers, so that these can be
    // directly assigned to the variable without actually typing the whole number.
    var minPrice = Integer.MAX_VALUE;
    var maxProfit = 0;

    for (i in prices.indices) {
        if (prices[i] < minPrice) {
            minPrice = prices[i]
        } else if ( (prices[i] - minPrice) > maxProfit ) {
            maxProfit = prices[i] - minPrice
        }
    }

    return maxProfit
}

fun main(args: Array<String>) {
    val prices = intArrayOf(7,1,5,3,6,4)
    println("profit: ${maxProfit(prices)}");
}