package mykotlin.algorithms

fun minimumValue(n: IntArray): Int {
    var minValue = n[0]
    for (i in n.indices) {
        if (n[i] < minValue) {
            minValue = n[i]
        }
    }

    return minValue
}