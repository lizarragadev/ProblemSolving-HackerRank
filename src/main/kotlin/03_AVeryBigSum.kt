import java.io.PrintWriter

/**
 * Prepare > Problem Solving > A Very Big Sum
 *
 * https://www.hackerrank.com/challenges/a-very-big-sum//
 * @author lizarragadev
 *
 */

fun main() {
    _writer.ps03()
    _writer.flush()
}

fun PrintWriter.ps03() {
    val n = readInt()
    val ar = readLongArray(n)
    val result = aVeryBigSum(ar)
    println(result)
}

fun aVeryBigSum(ar: LongArray): Long {
    return ar.sum()
}