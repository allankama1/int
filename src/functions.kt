fun main() {

    //Predefined functions
    println("Hello Kotlin")

    var x = Math.min(45,89)
    println(x)

    var y = Math.max(90,124)
    println("The maximum value is $y")

    var z = Math.round(45.98)
    println(z)

    name()
    product(12,30)
    details("Allan",34)
    details("Mary",20)
}
//User-defined function
fun name() {
    println("Allan")
}

fun product(a:Int,b:Int){
    println(a * b)
}

fun details(name:String,age:Int){
    println("$name is $age years old")

}

