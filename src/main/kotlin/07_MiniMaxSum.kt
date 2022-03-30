import java.io.PrintWriter

/**
 * Prepare > Problem Solving > Mini-Max Sum
 *
 * https://www.hackerrank.com/challenges/mini-max-sum/
 * @author lizarragadev
 *
 */

fun main() {
    _writer.ps07()
    _writer.flush()
}

fun PrintWriter.ps07() {
    val n = readLongArray(5)
    miniMaxSum(n)
}

fun miniMaxSum(arr: LongArray) {
    val sumArr = LongArray(5)
    for (i in arr.indices) {
        val temp: Long = arr[i]
        arr[i] = 0
        sumArr[i] = arr.sum()
        arr[i] = temp
    }
    sumArr.sort()
    println("${sumArr[0]} ${sumArr[sumArr.size - 1]}")
}


