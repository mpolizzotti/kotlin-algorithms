package mykotlin.algorithms

// See: https://www.hackerrank.com/challenges/minimum-swaps-2/problem
class MinimumSwap {
    fun execute(arr: Array<Int>): Int {
        var i: Int = 0
        var swaps: Int = 0
        var temp: Int = 0

        while (i < arr.size) {
            if (arr[i] != (i + 1)) {
                temp = arr[i]
                arr[i] = arr[temp - 1]
                arr[temp - 1] = temp
                swaps++
            } else {
                i++
            }
        }

        return swaps
    }
}

fun main(args: Array<String>) {
    val arr: Array<Int> = arrayOf(7,1,3,2,4,5,6)
    val minimumSwap: MinimumSwap = MinimumSwap()
    println(minimumSwap.execute(arr))
}