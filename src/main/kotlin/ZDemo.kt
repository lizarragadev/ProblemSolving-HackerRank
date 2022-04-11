fun main() {
    //println(shapeArea(5))
    //println(lateRide(1439))
    val list = mutableListOf<Int>()
    list.addAll(listOf(1, 3, 2, 1))
    println(almostIncreasingSequence(list))
}

fun almostIncreasingSequence (s: MutableList<Int>): Boolean {
    fun checkIncreasing (arr: MutableList<Int>): Boolean {
        for(i in 1..arr.size -1) {
            if(arr[i-1] >= arr[i])
                return false
        }
        return true
    }
    fun removeSeqBreak (arr: MutableList<Int>, itemInd: Int): Boolean {
        val curr = arr[itemInd]
        val prev = arr[itemInd- 1]
        val minLeft: Int? = s.slice (itemInd+1..s.size -1).minOrNull()
        if (prev >= curr) {
            if(minLeft == null || prev < minLeft)
                arr.removeAt (itemInd)
            else
                arr.removeAt (itemInd -1)
        }
        return checkIncreasing(arr)
    }
    for(i in 1..s.size -1) {
        val lastVal = s[i - 1]
        val currval= s[i]
        if (lastVal >= currval) {
            return removeSeqBreak(s, i)
        }
    }
    return true
}



fun lateRide(n: Int): Int {
    var result = (n%60)
        .toString()
        .toCharArray()
        .toList() + (n/60)
        .toString()
        .toCharArray()
        .toList()
    return result.toList()
        .map { it.toString().toInt() }
        .reduce { sum, element -> sum + element }
}

fun shapeArea(n: Int): Int {
    var resultado: Int = 1
    for (loop: Int in 1..n) {
        resultado+=calculateArea(loop)
    }
    return resultado
}

fun calculateArea(n: Int): Int {
    return 4.times(n - 1)
}
