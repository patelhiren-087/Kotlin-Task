// Task 5
// 5. Write a Kotlin program to find the factorial of a given number.

fun main() {
    print("Enter a number: ")
    var number = readLine()!!.toInt()

    var fact = 1
    for (i in 1..number) {
        fact *= i
    }

    println("Factorial of $number is: $fact")
}
