class Person{
    //Attributes/Properties
    var name = "John"
    var age = 55
    var gender = "Male"

    //Methods/Functions
    fun walk(){
        println("Person is walking")
    }
}

fun main() {

    var accountant = Person()
    accountant.walk()

    println(accountant.gender)

}