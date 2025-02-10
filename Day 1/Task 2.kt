// Task 2
// 2. Write a Kotlin program to perform addition, subtraction, multiplication and division of two numbers.


fun main() {
     
    print("Enter first number: ")
    val num1 = readLine()!!.toDouble() 

    print("Enter second number: ")
    val num2 = readLine()!!.toDouble() 

    val addition = num1 + num2
    val subtraction = num1 - num2
    val multiplication = num1 * num2
    val division = num1 / num2 

    println("Addition: $addition")
    println("Subtraction: $subtraction")
    println("Multiplication: $multiplication")
    println("Division: $division")
}
