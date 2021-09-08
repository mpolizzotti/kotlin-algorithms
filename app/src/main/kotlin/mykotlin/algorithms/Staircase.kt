package mykotlin.algorithms

class Staircase {
    fun execute(n: Int): HashMap<String, String> {
        var str: String = ""
        val spacer: String = " "
        var result: HashMap<String, String> = HashMap()

        for (a in 1..n) {
            val b = a;
            val numOfSpaces = (n - a);

            for (c in 1..b) {
                str = str.plus("#")
            }

            for (d in 1..numOfSpaces) {
                str = spacer.plus(str)
            }

            println("$str")
            result["$a"] = str
            str = ""
        }

        println("result: $result")
        return result
    }
}

fun main(args: Array<String>) {
    val n: Int = 4
    val staircase: Staircase = Staircase()
    staircase.execute(n)
}