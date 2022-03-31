import java.io.PrintWriter
import java.text.SimpleDateFormat
import java.util.Date

/**
 * Prepare > Problem Solving > Grading Students
 *
 * https://www.hackerrank.com/challenges/grading/
 * @author lizarragadev
 *
 */

fun main() {
    _writer.ps10()
    _writer.flush()
}

fun PrintWriter.ps10() {
    val n = readInt()
    val arr = readIntArray(n)
    val res = gradingStudents(arr)
    res.forEach { println(it) }
}

fun gradingStudents(grades: IntArray): IntArray {
    for (i in grades.indices) {
        val next = nextFiveMultiplo(grades[i])
        if(next >= 40)
            if(next - grades[i] < 3)
                grades[i] = next
    }
    return grades
}

fun nextFiveMultiplo(n: Int): Int {
    var found = false
    var aux = n
    while (!found) {
        aux++
        if(aux % 5 == 0)
            found = true
    }
    return aux
}


