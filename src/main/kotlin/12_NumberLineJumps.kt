import java.io.PrintWriter

/**
 * Prepare > Problem Solving > Number Line Jumps
 *
 * https://www.hackerrank.com/challenges/kangaroo/
 * @author lizarragadev
 *
 */

fun main() {
    _writer.ps12()
    _writer.flush()
}

fun PrintWriter.ps12() {
    val x1 = readInt()
    val v1 = readInt()
    val x2 = readInt()
    val v2 = readInt()

    val res = kangaroo(x1, v1, x2, v2)
    println(res)
}

fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
    var auxX1 = x1
    var auxX2 = x2
    if(x2 > x1 && v2 > v1)
        return "NO"
    else
        while (auxX2 > auxX1) {
            auxX2 += v2
            auxX1 += v1
            if(auxX1 == auxX2)
                return "YES"
            if (auxX1 > auxX2)
                return "NO"
        }
    return "NO"
}
