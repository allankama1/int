fun main() {

    var greeting = "Hello world"
    var firstname = "Allan"
    var lastname = "Mwaura"

    //string concatenation
    println(firstname + " " + lastname)
    println(firstname.plus(lastname))

    //Accessing an element in as string
    println(greeting[6])

    //Determining an index position of any element
    println(greeting.indexOf("world"))
    println(greeting.indexOf('l'))

    //Modifying a string
    println(greeting.uppercase())

    //string interpolation
    println("hello there, my name is $firstname $lastname")

    //size of a string
    println(greeting.length)

}