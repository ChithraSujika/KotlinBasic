package mykotlin

//IN KOTLIN DEFAULT CLASSES ARE PUBLIC & FINAL
//TO INHERIT ALLTHE PROPERTY OF THE PARTICULAR CLASS NEED TO USE "OPEN" KEYWORD IN KOTLIN
//IN KOTLIN SUB CLASS->SUPER CLASS->ANY

//EXCPET ABOVE POINT ALL ARE SAME AS JAVA

/*ANY
* "ANY" CLASS CONTAINS FUNCTIONS SUCH AS
* equals():Boolean
* hashcode():Int
* toString():String
* */

/*
Inheritance -->classes are public & final in nature -->for inherit you make class open keyword ---> parent class, child class
single level ---> class B inherit from class A
multilevel --->C inherit from B inherit from A
hierarchial --> C &B inherit from A
*In kotlin we have super class "Any" -->it contain -->equals(), hascode() & toString methods -->inheritance USED for CODE REUSABALITY , METHOD OVERRIDING */


//IN BELOW EXAMPLE EAT FUNCTION & COLOR IS REPEAATED HENCE IN THIS TIME WE CAN USE INHERIT FUN TO REDUCE A CODE
/*
fun main(args: Array<String>) {
}

class dog{
    var color:String=""
    var breed:String=""

    fun bark(){
        println("Bark")
    }
    fun eat(){
        println("EAT")
    }
}

class cat{
    var color:String=""
    var age:Int=3

    fun meow(){
        println("MEOW")
    }
    fun eat(){
        println("EAT")
    }
}*/


fun main(args: Array<String>) {
    var x = Dog()//OBJECT CREATION
    x.breed="BREED"
    x.color="BLACK"
    x.bark()
    x.eat()


    var y = Cat()//OBJECT CREATION
    y.color="WHITE"
    y.age=3
    y.meow()
    y.eat()

    var z=Animal()
    z.eat()
    z.color="WHITE"
}

open class Animal {
    //CREATE ONE CLASS & TAKE ALL REPEATED THINGS //class Animal -> it will display ERROR B'COZ BY DEFAULT IT BE FINAL & PUBLIC HENCE USED "OPEN" KEYWORD
    var color: String = ""
    fun eat() {
        println("EAT")
    }
}

class Dog : Animal() {
    var breed: String = ""
    fun bark() {
        println("Bark")
    }
}

class Cat : Animal() {
    var age: Int =-1
    fun meow() {
        println("MEOW")
    }
}