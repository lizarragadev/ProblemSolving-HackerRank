import java.io.PrintWriter

/**
 * Prepare > Problem Solving > Solve Me First
 *
 * https://www.hackerrank.com/challenges/solve-me-first/
 * @author lizarragadev
 *
 */

fun main() {
    _writer.ps01()
    _writer.flush()
}

fun PrintWriter.ps01() {
    println(readInt() + readInt())
}