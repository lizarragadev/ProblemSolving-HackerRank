import java.io.PrintWriter

/**
 * Prepare > Problem Solving > Compare the Triplets
 *
 * https://www.hackerrank.com/challenges/compare-the-triplets/
 * @author lizarragadev
 *
 */

fun main() {
    _writer.ps02()
    _writer.flush()
}

fun PrintWriter.ps02() {
    val a = readIntArray(3)
    val b = readIntArray(3)
    val res = compareTriplets(a, b)
    res.forEach { print("$it ") }
}

fun compareTriplets(a: IntArray, b: IntArray): IntArray {
    val res = IntArray(2)
    var sumA = 0
    var sumB = 0
    a.forEachIndexed { index, value ->
        if(a[index] > b[index])
            sumA++
        else if(a[index] < b[index])
                sumB++
    }
    res[0] = sumA
    res[1] = sumB
    return  res
}
