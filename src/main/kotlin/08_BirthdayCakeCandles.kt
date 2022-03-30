import java.io.PrintWriter

/**
 * Prepare > Problem Solving > Birthday Cake Candles
 *
 * https://www.hackerrank.com/challenges/birthday-cake-candles/
 * @author lizarragadev
 *
 */

fun main() {
    _writer.ps08()
    _writer.flush()
}

fun PrintWriter.ps08() {
    val n = readInt()
    val candles = readIntArray(n)
    val res = birthdayCakeCandles(candles)
    println(res)
}

fun birthdayCakeCandles(candles: IntArray): Int {
    val max = getMax(candles)
    val count = candles.count { it == max }
    return count
}

fun getMax(arr: IntArray): Int {
    var max = Int.MIN_VALUE
    for (i in arr.indices) {
        if(arr[i] > max)
            max = arr[i]
    }
    return max
}

