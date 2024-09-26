package mykotlin//$ INTERPOLATION

/*
fun main(args :Array<String>){
    val a="Good Morning"
    //b=a+"Mornning" // JAVA
    val b=" Hi $a"
    println(b)
    println("$b Have a nice day ")
    println("$b. Have a nice day, The number of Character is $b.length ")
    println("$b. Have a nice day, The number of Character is ${b.length} ") //CURLEY BRACKET

    //IF INTERPOLATION NEED TO APPLY FOR BOTH A & B USE CURLEY BRACKET
    val x="Good "
    val y="Morning"
    println("The sum of $x and $y is $x+y")//WITHOUT CURLEY BRACKET O/P IS GOOD +Y
    println("The sum of $x and $y is ${x+y}")//The sum of Good  and Morning is Good Morning
}
*/

fun main(args : Array<String>){
 var rect= Rectangle()//OBJECT CREATION TO GET THE CLASS METHOD
    rect.length=150
    rect.height=180
    println("The Rectangle length is ${rect.length} and The Rectangle Height is ${rect.length} ,The Arera of Rectangle is ${rect.length*rect.height}")
}
class Rectangle{
    var length:Int=0
    var height:Int=0
}

