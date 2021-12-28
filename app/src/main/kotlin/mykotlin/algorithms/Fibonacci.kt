package mykotlin.algorithms

fun fibonacci(n: Int): Int {
    val sequence: MutableList<Int> = mutableListOf(1, 1)

    for (i in 2..n) {
        sequence.add(sequence[i - 2] + sequence[i - 1])
    }

    return sequence[n]
}

fun main(args: Array<String>) {
    println("Answer: ${fibonacci(5)}")
}