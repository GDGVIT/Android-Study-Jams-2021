fun main() {
    val age = 19
    val name = "Neil"
    val layers = 4
    val border = "`-._,-'"
    val timesToRepeat = 4

    printBirthdayWish(name, border, timesToRepeat)
    println()
    printCake(age, layers)
    printAgeGreetings(age)
}

fun printBirthdayWish(name: String, border: String, timesToRepeat: Int) {
    repeat(timesToRepeat) {
        print(border)
    }
    println()
    println("Happy Birthday, $name!")
    repeat(timesToRepeat) {
        print(border)
    }
}

fun printCakeCandles(age: Int) {
    println()
    print(" ")
    repeat(age) {
        print(",")
    }
    println() // Print an empty line

    print(" ") // Print the inset of the candles on the cake
    repeat(age) {
        print("|")
    }
    println()
}

fun printCakeBottom(age: Int, layers: Int) {
    repeat(layers) {
        repeat(age + 2) {
            print("@")
        }
        println()
    }
}

fun printCake(age: Int, layers: Int) {
    printCakeCandles(age)
    printCakeBottom(age, layers)
}

fun printAgeGreetings(age: Int) {
    println()
    println("You are already $age!")
    println("$age is the very best age to celebrate!")
}