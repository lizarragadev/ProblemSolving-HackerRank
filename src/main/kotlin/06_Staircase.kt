import java.io.PrintWriter

/**
 * Prepare > Problem Solving > Staircase
 *
 * https://www.hackerrank.com/challenges/staircase/
 * @author lizarragadev
 *
 */

fun main() {
    _writer.ps06()
    _writer.flush()
}

fun PrintWriter.ps06() {
    val n = readInt()
    staircase(n)
}

fun staircase(n: Int) {
   for(i in 1..n) {
       println("${" ".repeat(n - i)}${"*".repeat(i)}")
   }
}


