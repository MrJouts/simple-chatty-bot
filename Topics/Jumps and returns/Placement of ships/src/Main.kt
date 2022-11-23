fun main() {
    val (x1, y1) = readln().split(" ").map { it.toInt() }
    val (x2, y2) = readln().split(" ").map { it.toInt() }
    val (x3, y3) = readln().split(" ").map { it.toInt() }

    var output1 = ""
    var output2 = ""

    for (i in 1..5) {
        if (i == x1 || i == x2 || i == x3) continue
        output1 += i.toString()
    }

    for (i in 1..5) {
        if (i == y1 || i == y2 || i == y3) continue
        output2 += i.toString()
    }

    println(output1.toList().joinToString(" "))
    println(output2.toList().joinToString(" "))
}