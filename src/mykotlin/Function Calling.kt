package mykotlin

import com.person.Person

/*
fun main(args:Array<String>){
    var a:String
    a="Sorry"
    display(a)
}
fun display( a:String){
    println(a)
}
*/


//WRITING FUNCTION INSIDE A CLASS
/*
fun main(args: Array<String>) {
    var a: String
    a = "Sorry"
    var b = Person()//OBJECT CREATION [IN KOTLIN NO NEED TO USE NEW KEYWORD]
    b.display(a)
}

class Person {
    fun display(a: String) {
        println(a)
    }
}
*/


//DECLARE VARIABLE INSIDE A CLASS
/*
fun main(args: Array<String>) {

    var b = Person()//OBJECT CREATION [IN KOTLIN NO NEED TO USE NEW KEYWORD]
    b.a = "Sorry"
    b.display(b.a)
}

class Person {
    var a: String=""
    fun display(a: String) {
        println(a)
    }
}
*/


//REMOVING THE PARAMETER [ PARAMETED IS ALREADY DEFINE IN THE CLASS]
/*
fun main(args: Array<String>) {

    var b = Person()//OBJECT CREATION [IN KOTLIN NO NEED TO USE NEW KEYWORD]
    b.a = "Sorry"
    b.display()
}

class Person {
    var a: String=""
    fun display() {
        println(a)
    }
}
*/


//DISPLAYING THE NAME IN MAIN METHOD WITHOUT FUN
/*
fun main(args: Array<String>) {

    var b = Person()//OBJECT CREATION [IN KOTLIN NO NEED TO USE NEW KEYWORD]
    b.a = "Sorry"
    println("The Another name of apologise"+b.a)// JAVA
}

class Person {
    var a: String=""

}
*/


//STRING INTERPOLATION [$ ]

/*
fun main(args: Array<String>) {

    var b = Person()//OBJECT CREATION [IN KOTLIN NO NEED TO USE NEW KEYWORD]
    b.a = "Sorry"
    println("The Another name of apologise ${b.a}")
    //println("The Another name of apologise $b.a") //ERROR Person@3b9a45b3.a
}

class Person {
    var a: String=""

}
*/


//WRITING A CLASS IN DIFFERENT PACKAGE
/*
fun main(args: Array<String>) {

    var b = Person() //Person will get ERROR ,If we write a class name with diff package , Just IMPORT IT
    b.a = "Sorry"
    println("The Another name of apologise ${b.a}")
    //println("The Another name of apologise $b.a") //ERROR Person@3b9a45b3.a
}
*/


//CONSTRUCTOR IN KOTLIN
fun main(args: Array<String>) {
    val b: Person = Person("SORRY")
    b.display()
}


