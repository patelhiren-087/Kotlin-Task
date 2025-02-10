// Task 3
// 3. Write a Kotlin program to check if a given number is even or odd.


fun main() {
  
    print("Enter a number: ")
    val number = readLine()!!.toInt()

    if (number % 2 == 0) {
        println("$number is Even.")
    } else {
        println("$number is Odd.")
    }
}
