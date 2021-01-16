package tasks

/*

Create a function which will calculate 5% of any given number and return the ans

 */

fun fivePer(num: Double): Double {
    return num * 0.05
}

fun main() {
    val res = fivePer(100.0)
    println(res)
}