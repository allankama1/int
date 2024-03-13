fun main() {

    //While loop
    var number = 200
    while (number <= 205){
        println("Number is $number")
        number++
    }
    //Decrement
    var no = 100
    while (no >=95){
        println("Number is $no")
        no--
    }

    //Do...while loop
    var num = 20
    do {
        println(num)
        num++
    }while (num <= 25)

    //For loop
    var furniture = arrayOf("Table","Chair","Bed")
    for (z in furniture){
        println(z)
    }

    var marks = arrayOf(98,94,80,50,10)
    for (p in marks){
        println(p)
    }

    //Range
    for (number in 30 .. 35){
        println(number)
    }

    for (char in 'a'..'e')
    println("Character is $char")

}