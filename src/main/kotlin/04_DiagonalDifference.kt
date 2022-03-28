import java.io.PrintWriter
import kotlin.math.absoluteValue

/**
 * Prepare > Problem Solving > Diagonal Difference
 *
 * https://www.hackerrank.com/challenges/diagonal-difference/
 * @author lizarragadev
 *
 */

fun main() {
    _writer.ps04()
    _writer.flush()
}

fun PrintWriter.ps04() {
    val n = readInt()
    val matrix = readMatrix(n)
    val result = diagonalDifference(matrix)
    println(result)
}

fun diagonalDifference(arr: Array<IntArray>): Int {
    var sumDiag1 = 0
    var sumDiag2 = 0

    for (i in arr.indices) {
        for (j in arr.indices) {
            if( i == j )
                sumDiag1 += arr[i][i]
            if( (i + j) == arr.size - 1)
                sumDiag2 += arr[i][j]
        }
    }
    return (sumDiag1 - sumDiag2).absoluteValue
}

fun readMatrix(n: Int): Array<IntArray> {
    val matrix = Array(n) { IntArray(n) }
    for (i in 0 until n) {
        for (j in 0 until n) {
            matrix[i][j] = readInt()
        }
    }
    return matrix
}