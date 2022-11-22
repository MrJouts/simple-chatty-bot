fun main() {
    val sentence = readln()
    val n = readln().toInt()
    println("Symbol # $n of the string \"$sentence\" is '${sentence[n - 1]}'")

}