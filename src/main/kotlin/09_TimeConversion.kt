import java.io.PrintWriter
import java.text.SimpleDateFormat
import java.util.Date

/**
 * Prepare > Problem Solving > Time Conversion
 *
 * https://www.hackerrank.com/challenges/time-conversion/
 * @author lizarragadev
 *
 */

fun main() {
    _writer.ps09()
    _writer.flush()
}

fun PrintWriter.ps09() {
    val s = read()
    val res = timeConversion(s)
    println(res)
}

fun timeConversion(s: String): String {
    val inputDateFormat = SimpleDateFormat("hh:mm:ssaa")
    val outputDateFormat = SimpleDateFormat("HH:mm:ss")
    val date: Date = inputDateFormat.parse(s)
    return outputDateFormat.format(date)
}



