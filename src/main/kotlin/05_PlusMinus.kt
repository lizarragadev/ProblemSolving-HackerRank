import java.io.PrintWriter

/**
 * Prepare > Problem Solving > Plus Minus
 *
 * https://www.hackerrank.com/challenges/plus-minus/
 * @author lizarragadev
 *
 */

fun main() {
    _writer.ps05()
    _writer.flush()
}

fun PrintWriter.ps05() {
    val n = readInt()
    val array = readIntArray(n)
    plusMinus(array)
}

fun plusMinus(array: IntArray) {
    var countPositive = 0
    var countNegative = 0
    var countZero = 0
    for (i in array.indices) {
        if(array[i] > 0) countPositive++
        else if (array[i] < 0) countNegative++
        else countZero++
    }
    println("%.6f".format(countPositive/array.size.toDouble()))
    println("%.6f".format(countNegative/array.size.toDouble()))
    println("%.6f".format(countZero/array.size.toDouble()))
}
