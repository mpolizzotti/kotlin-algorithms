package mykotlin.algorithms

class DiagonalDifference {
    fun execute(arr: Array<Array<Int>>): Int {
        var leftDiagonal: Int = 0
        var rightDiagonal: Int = 0

        for (i in arr.indices) {
            val nestedArray = arr[i]
            val length = (nestedArray.size - 1)
            leftDiagonal += nestedArray[i]
            rightDiagonal += nestedArray[length - i]
        }

        val difference = (leftDiagonal - rightDiagonal)
        return if (difference < 0) (difference * -1) else difference
    }
}

fun main(args: Array<String>) {
    val diagonalArray = arrayOf<Array<Int>>(
        arrayOf<Int>(11, 2, 4),
        arrayOf<Int>(4, 5, 6),
        arrayOf<Int>(10, 8, -12)
    )

    val diagonalDifference: DiagonalDifference = DiagonalDifference()
    println("Answer: ${diagonalDifference.execute(diagonalArray)}")
}