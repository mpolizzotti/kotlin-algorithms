package mykotlin.algorithms

import kotlin.math.sqrt

fun isPrime(n: Int): Boolean {
    // Check if number is an integer.
    // Any integer % 1 will equal 0.
    if (n % 1 != 0) {
        return false
    }

    // If number is less than or equal to one then it isn't prime by definition.
    // Improves time complexity to O(1) or constant time.
    if (n <= 1) {
        return false
    }

    // The numbers 2, and 3 are prime.
    // Improves time complexity to O(1) or constant time.
    if (n <= 3) {
        return true
    }

    // If the number is divisible by 2 then we can immediately determine that
    // the number is not a prime number.
    // Improves time complexity to O(1) or constant time.
    if (n % 2 === 0) {
        return false
    }

    for (i in 3..sqrt(n.toDouble()).toInt()) {
        // How many times does `i` go into `n`? Is there a remainder?
        // When no remainder exists, `n` cannot be prime. We expect
        // all prime numbers to generate remainders.
        if (n % i === 0) {
            return false;
        }
    }

    return true
}

fun main(args: Array<String>) {
    println("isPrime: ${isPrime(4)}");
}