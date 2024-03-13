import java.util.Scanner

fun main() {
    var pointer = Scanner(System.`in`)

    print("Enter mark:")
    var mark:Int = pointer.nextInt()

    var grade = when(mark){
    in(80..100)-> 'A'
    in(70..79)-> 'B'
    in(60..69)-> 'C'
    in(50..59)-> 'D'
    in(30..49)-> 'E'

        else -> 'E'
    }
    println("Your grade is $grade")
}
