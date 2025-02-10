// Task 4
// 4. Write a Kotlin program to find the maximum and minimum of three numbers.


fun main() {
    print("Enter first number: ")
    val num1 = readLine()!!.toInt()

    print("Enter second number: ")
    val num2 = readLine()!!.toInt()

    print("Enter third number: ")
    val num3 = readLine()!!.toInt()

    var max = num1
    if (num2 > max) max = num2
    if (num3 > max) max = num3

    var min = num1
    if (num2 < min) min = num2
    if (num3 < min) min = num3

    println("Maximum: $max")
    println("Minimum: $min")
}
