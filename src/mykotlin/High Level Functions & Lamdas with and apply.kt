package mykotlin
//COMMON CODE
/*fun main(args: Array<String>) {
    var z = Persons()
    z.name = "hello"
    z.age = 32
    println(z.name)
    println(z.age)
}

class Persons {
    var name: String = ""
    var age: Int = -1
    fun startRun() {
        println("NOW I AM READY TO RUN")
    }
}*/

// WITH KEYWORD

/*fun main(args: Array<String>) {
    var z = Persons()
//WITH KEYWORD IS PART OF KOTLIN STANDARD LIBRARY  NOT KOTLIN LANGUAGE
    //INSTEAD OF REPEATING z multiple with help of lamda can reduce it
    with(z) { name = "hello"
        age = 32 }
    //WITH KEYWORD , OBJECT VARIBLE , {} LAMDA CURLY .
//IN WITH KEYWORD CANNOT CALL THE FUNCTION EX: startRun
    println(z.name)
    println(z.age)
}

class Persons {
    var name: String = ""
    var age: Int = -1
    fun startRun() {
        println("NOW I AM READY TO RUN")
    }
}*/

//APPLY KEYWORD

fun main(args: Array<String>) {
    var z = Persons()
    z.apply {
        name = "hello"
        age = 32
    }.startRun()
//IN APPLY KEYWORD CAN CALL THE FUNCTION EX: startRun
    println(z.name)
    println(z.age)
}

class Persons {
    var name: String = ""
    var age: Int = -1
    fun startRun() {
        println("NOW I AM READY TO RUN")
    }
}
