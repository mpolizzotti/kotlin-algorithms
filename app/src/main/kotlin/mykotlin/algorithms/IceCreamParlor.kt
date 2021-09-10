package mykotlin.algorithms

// See: https://www.hackerrank.com/challenges/icecream-parlor/problem
class IceCreamParlor {
    fun execute(m: Int, arr: Array<Int>): Array<Int> {
        val indices: Array<Int> = Array(2) { i -> i * 1 }
        var isFound: Boolean = false

        for (i in 0 until arr.size) {
            val indexTracker: Int = i

            for (y in 0 until arr.size) {
                val nestedIndexTracker: Int = y
                if (indexTracker != nestedIndexTracker && !isFound) {
                    val totalCost: Int = arr[i] + arr[y];
                    if (totalCost == m) {
                        indices[0] = (indexTracker + 1)
                        indices[1] = (nestedIndexTracker + 1)
                        isFound = true;
                        break
                    }
                }
            }
        }

        return indices
    }
}

fun main(args: Array<String>) {
    val m: Int = 6
    val arr: Array<Int> = arrayOf(1,3,4,5,6)
    val iceCreamParlor: IceCreamParlor = IceCreamParlor()
    iceCreamParlor.execute(m, arr)
}
