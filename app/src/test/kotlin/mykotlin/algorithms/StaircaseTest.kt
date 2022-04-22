package mykotlin.algorithms

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class StaircaseTest {
    @Test
    fun `should return an object representing a right-justified staircase 4 levels deep`(): Unit {
        val n = 4;
        val staircase: Staircase = Staircase()
        val result: HashMap<String, String> = staircase.execute(n)
        val expected: HashMap<String, String> = HashMap()
        expected["1"] = "   #"
        expected["2"] = "  ##"
        expected["3"] = " ###"
        expected["4"] = "####"

        assertEquals(expected, result)
    }

    @Test
    fun `should return an object representing a right-justified staircase 6 levels deep`(): Unit {
        val n = 6;
        val staircase: Staircase = Staircase()
        val result: HashMap<String, String> = staircase.execute(n)
        val expected: HashMap<String, String> = HashMap()
        expected["1"] = "     #"
        expected["2"] = "    ##"
        expected["3"] = "   ###"
        expected["4"] = "  ####"
        expected["5"] = " #####"
        expected["6"] = "######"

        assertEquals(expected, result)
    }
}
