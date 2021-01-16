fun main() {

    val a = 12
    val b = 5

    // enter operator either +, -, * or /
    val operator = "*"

    val result: Any = when (operator) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> a / b
        else -> "$operator operator is invalid operator."
    }

    println("result = $result")
}
