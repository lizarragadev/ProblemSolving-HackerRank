import java.io.PrintWriter

/**
 * Prepare > Problem Solving > Apple and Orange
 *
 * https://www.hackerrank.com/challenges/apple-and-orange/
 * @author lizarragadev
 *
 */

fun main() {
    _writer.ps11()
    _writer.flush()
}

fun PrintWriter.ps11() {
    val s = readInt()
    val t = readInt()
    val a = readInt()
    val b = readInt()
    val m = readInt()
    val n = readInt()
    val apples = readIntArray(m)
    val oranges = readIntArray(n)
    countApplesAndOranges(s, t, a, b, apples, oranges)
}

fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: IntArray, oranges: IntArray) {
    println(getCount(apples, a, s, t))
    println(getCount(oranges, b, s, t))
}

fun getCount(arr: IntArray, ab: Int, s: Int, t: Int): Int {
    var countBetweenApples = 0
    arr.forEach {
        val res = ab + it
        if(res in s..t)
            countBetweenApples++
    }
    return countBetweenApples
}