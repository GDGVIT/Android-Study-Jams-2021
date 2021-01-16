fun add(num1: Int = 10, num2: Int): Int {
    return num1 + num2
}

fun main() {
    val res = add(num2 = 5)
    println(res)
}