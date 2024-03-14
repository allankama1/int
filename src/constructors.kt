class Dog(var name:String,var breed:String,var age:Int){

    fun move(movement:String){
        println("The dog is $movement")

    }

}

fun main() {
    var dog1 = Dog("Rex","Bulldog",4)
    var dog2 = Dog("Trix","Pitbull",5)
    var dog3 = Dog("Drx","Husky",3)

    println(dog1.breed)
    println(dog1.name)

    dog1.move("walking")
    dog2.move("running")
}